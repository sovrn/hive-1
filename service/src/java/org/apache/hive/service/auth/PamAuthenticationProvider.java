/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hive.service.auth;

import javax.security.sasl.AuthenticationException;
import net.sf.jpam.Pam;
import net.sf.jpam.PamReturnValue;
import org.apache.hadoop.hive.conf.HiveConf;

public class PamAuthenticationProvider implements PasswdAuthenticationProvider {

    @Override
    public void Authenticate(String user, String  password)
            throws AuthenticationException {

      HiveConf conf = new HiveConf();
      String hivePamProfiles = conf.get("hive.server2.authentication.pam.profiles");
      if (hivePamProfiles == null || hivePamProfiles.trim().isEmpty()) {
        throw new AuthenticationException("PAM profiles not configured for hive");
      }

      String pamSchemes[] = hivePamProfiles.split(",");
      for (String pamScheme : pamSchemes) {
        pamScheme = pamScheme.trim();
        if (pamScheme.isEmpty())
          continue;

        try {
          Pam pam = new Pam(pamScheme);
          PamReturnValue err = pam.authenticate(user, password);
          if (err != PamReturnValue.PAM_SUCCESS) {
            throw new AuthenticationException("Error validating user through PAM. PamReturnValue=" + err);
          }
        } catch(LinkageError ex) {
          throw new AuthenticationException("Link Error", ex);
        }
      }
    }
}
/*
 * Copyright (c) 2010, Paul Merlin. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.n0pe.asadmin.commands;

import org.n0pe.asadmin.AbstractAsAdminCmd;

/**
 * @author Paul Merlin
 */
public class PingConnectionPool
        extends AbstractAsAdminCmd
{

    public static final String PING = "ping-connection-pool";
    private String poolName;

    private PingConnectionPool()
    {
    }

    public PingConnectionPool( String poolName )
    {
        this.poolName = poolName;
    }

    public boolean needCredentials()
    {
        return false;
    }

    public String getActionCommand()
    {
        if ( poolName == null ) {
            throw new IllegalStateException();
        }
        return PING;
    }

    public String[] getParameters()
    {
        if ( poolName == null ) {
            throw new IllegalStateException();
        }
        return new String[]{ poolName };
    }

}

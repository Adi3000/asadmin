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
package org.n0pe.mojo.asadmin;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import org.n0pe.asadmin.AsAdminCmdList;
import org.n0pe.asadmin.commands.CreateFileUser;

/**
 * @goal create-file-user
 */
public class CreateFileUserMojo
        extends AbstractAsadminMojo
{

    /**
     * @parameter
     * @required
     */
    private String userPasswordFile;
    /**
     * @parameter
     * @required
     */
    private String group;
    /**
     * @parameter
     * @required
     */
    private String userName;

    @Override
    protected AsAdminCmdList getAsCommandList()
            throws MojoExecutionException, MojoFailureException
    {
        getLog().info( "Create file user: " + userName );
        AsAdminCmdList cmdList = new AsAdminCmdList();
        cmdList.add( new CreateFileUser( userName ).withGroup( group ).withPasswordFile( userPasswordFile ) );
        return cmdList;
    }

}

/**
 * asadmin-glassfish-plugin : a maven plugin for glassfish administratives tasks
 * 
 * Copyright (C) 2008  Paul Merlin
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.n0pe.mojo.asadmin;


import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import org.n0pe.asadmin.commands.AsAdmin;
import org.n0pe.asadmin.commands.AsAdminException;
import org.n0pe.asadmin.commands.asadmin.Deployment;


/**
 * @goal undeploy
 * @description Deploys an enterprise application, web application, EJB module, connector module, or application client
 * module. If the component is already deployed or already exists, it is forcefully redeployed if the --force option is 
 * set to true.
 * @author Paul Merlin <eskatos@n0pe.org>
 */
public class UndeployMojo
        extends AbstractAsadminMojo {


    public void execute()
            throws MojoExecutionException, MojoFailureException {
        super.execute();
        getLog().info("Undeploying application: " + appName);
        final AsAdmin asadmin = AsAdmin.getInstance(this);
        try {
            asadmin.run(new Deployment().undeploy().component(appName));
        } catch (AsAdminException ex) {
            throw new MojoExecutionException(ex.getMessage(), ex);
        }
    }


}

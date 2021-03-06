/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package test;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyObject implements HttpSessionBindingListener {

    /*
     * Notifies the object that it is being bound to a session, and
     * identifies the session.
     *
     * @param event The event that identifies the session 
     */
    public void valueBound(HttpSessionBindingEvent event) {
        // do nothing
    }
    
    /*
     * Notifies the object that it is being unbound from a session, and
     * identifies the session.
     *
     * @param event The event that identifies the session 
     */
    public void valueUnbound(HttpSessionBindingEvent event) {

        HttpSession session = event.getSession();
        ServletContext sc = session.getServletContext();
        sc.setAttribute("successHttpSessionBindingListener", new Object());
    }

}


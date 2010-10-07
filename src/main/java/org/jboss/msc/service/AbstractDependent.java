/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.msc.service;

/**
 * Depends on one or more dependencies, represented by {@code AbstractDependency}.
 * 
 * @author <a href="mailto:flavia.rainone@jboss.com">Flavia Rainone</a>
 * @see AbstractDependency
 * @see AbstractDependency#addDependent(AbstractDependent)
 * @see AbstractDependency#removeDependent(AbstractDependent)
 */
abstract class AbstractDependent {

    /**
     * Notify this dependent that one of its dependencies is installed.
     */
    abstract void dependencyInstalled();

    /**
     * Notify this dependent that one of its dependencies is uninstalled.
     */
    abstract void dependencyUninstalled();

    /**
     * Notify this dependent that one of its dependencies entered {@link ServiceInstanceImpl.Substate#UP UP} state.
     * This method must not be called under a lock.
     */
    abstract void dependencyUp();

    /**
     * Notify this dependent that one of its dependencies is leaving the {@link ServiceInstanceImpl.Substate#UP UP} state.
     * This method must not be called under a lock.
     */
    abstract void dependencyDown();
}

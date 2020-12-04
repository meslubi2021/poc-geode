/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.apache.geode.internal.monitoring;

import java.util.concurrent.ConcurrentMap;

import org.apache.geode.internal.monitoring.executor.AbstractExecutor;

public class ThreadsMonitoringImplDummy implements ThreadsMonitoring {

  @Override
  public void close() {}

  @Override
  public boolean startMonitor(Mode mode) {
    return true;
  }

  @Override
  public void endMonitor() {}

  @Override
  public AbstractExecutor createAbstractExecutor(Mode mode) {
    return null;
  }

  @Override
  public boolean register(AbstractExecutor executor) {
    return true;
  }

  @Override
  public void unregister(AbstractExecutor executor) {

  }

  @Override
  public void updateThreadStatus() {}

  @Override
  public ConcurrentMap<Long, AbstractExecutor> getMonitorMap() {
    return null;
  }

}

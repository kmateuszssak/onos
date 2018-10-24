/*
 * Copyright 2018-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.net.host;

import org.onosproject.net.ConnectPoint;
import org.onosproject.net.Host;

/**
 * Service for interacting with the host probing entities.
 *
 * @deprecated in ONOS 1.12, replaced by {@link HostProbingService}
 */
@Deprecated
public interface HostLocationProbingService {
    /**
     * Probes given host on given location.
     *
     * @param host the host to be probed
     * @param connectPoint the location of host to be probed
     * @param probeMode probe mode
     * @deprecated in ONOS 1.12, replaced by {@link HostProbingService#probeHost(Host, ConnectPoint, ProbeMode)}
     */
    @Deprecated
    void probeHost(Host host, ConnectPoint connectPoint, ProbeMode probeMode);
}
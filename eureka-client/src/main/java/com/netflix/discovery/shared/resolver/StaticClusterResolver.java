/*
 * Copyright 2015 Netflix, Inc.
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

package com.netflix.discovery.shared.resolver;

import java.util.List;

/**
 * Statically configured Eureka server pool.
 *
 * @author Tomasz Bak
 */
public class StaticClusterResolver implements ClusterResolver {

    private final List<EurekaEndpoint> eurekaEndpoints;

    public StaticClusterResolver(List<EurekaEndpoint> eurekaEndpoints) {
        this.eurekaEndpoints = eurekaEndpoints;
    }

    @Override
    public List<EurekaEndpoint> getClusterServers() {
        return eurekaEndpoints;
    }

    @Override
    public void shutdown() {
    }
}
/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
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
package org.kie.workbench.common.stunner.cm.backend.dataproviders;

import javax.enterprise.inject.Typed;

import org.kie.workbench.common.services.refactoring.service.ResourceType;
import org.kie.workbench.common.stunner.bpmn.project.backend.dataproviders.CalledElementFormProjectDataProvider;
import org.kie.workbench.common.stunner.cm.backend.query.FindCaseManagementIdsQuery;

@Typed(CaseCalledElementFormDataProvider.class)
public class CaseCalledElementFormDataProvider extends CalledElementFormProjectDataProvider {

    @Override
    public ResourceType getProcessIdResourceType() {
        return ResourceType.BPMN_CM;
    }

    @Override
    public String getQueryName() {
        return FindCaseManagementIdsQuery.NAME;
    }
}
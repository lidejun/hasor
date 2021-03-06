/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.dataway.web;
import net.hasor.dataway.authorization.PermissionType;
import net.hasor.dataway.authorization.RefAuthorization;
import net.hasor.dataway.config.MappingToUrl;
import net.hasor.dataway.config.Result;
import net.hasor.dataway.dal.EntityDef;
import net.hasor.dataway.dal.FieldDef;
import net.hasor.db.Transactional;
import net.hasor.db.transaction.Propagation;
import net.hasor.web.annotation.Post;
import net.hasor.web.annotation.QueryParameter;
import net.hasor.web.annotation.RequestBody;
import net.hasor.web.objects.JsonRenderEngine;
import net.hasor.web.render.RenderType;

import java.util.Map;

/**
 * 禁用 API
 * @author 赵永春 (zyc@hasor.net)
 * @version : 2020-03-25
 */
@MappingToUrl("/api/disable")
@RefAuthorization(PermissionType.ApiDisable)
@RenderType(value = "json", engineType = JsonRenderEngine.class)
public class DisableController extends BasicController {
    @Post
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Result<Object> doDisable(@QueryParameter("id") String apiId, @RequestBody() Map<String, Object> requestBody) {
        if (!apiId.equalsIgnoreCase(requestBody.get("id").toString())) {
            throw new IllegalArgumentException("id Parameters of the ambiguity.");
        }
        Map<FieldDef, String> apiObject = this.dataAccessLayer.getObjectBy(EntityDef.INFO, FieldDef.ID, apiId);
        if (apiObject == null) {
            return Result.of(404, "not found Api.");
        }
        return Result.of(this.datawayService.disableApi(apiId));
    }
}

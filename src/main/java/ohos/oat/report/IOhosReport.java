/*
 * Copyright (c) 2021 Huawei Device Co., Ltd.
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
 *
 * ChangeLog:
 * 2021.5 -  Add new interface to support concurrent reporting process.
 * Modified by jalenchen
 */

package ohos.oat.report;

import org.apache.rat.api.RatException;
import org.apache.rat.report.RatReport;

/**
 * New ohos report interface to support concurrent reporting process
 *
 * @author chenyaxun
 * @since 1.0
 */
public interface IOhosReport extends RatReport {

    /**
     * Concurrent reporting interface
     *
     * @throws RatException exception
     */
    public void concurrentReport() throws RatException;
}

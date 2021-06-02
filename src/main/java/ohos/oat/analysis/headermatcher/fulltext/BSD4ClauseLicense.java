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
 */

package ohos.oat.analysis.headermatcher.fulltext;

import static org.apache.rat.api.MetaData.RAT_URL_LICENSE_FAMILY_CATEGORY;
import static org.apache.rat.api.MetaData.RAT_URL_LICENSE_FAMILY_NAME;

import org.apache.rat.api.MetaData;

/**
 * Header matcher class for matching source code license headers
 *
 * @author chenyaxun
 * @since 1.0
 */
public class BSD4ClauseLicense extends OhosFullTextMatchingLicense {
    private static final String LICENSE_LINE_1 =
        "Redistribution and use in source and binary forms, with or without modification, are permitted provided"
            + " that the following conditions are met:";

    private static final String LICENSE_LINE_2 =
        "1. Redistributions of source code must retain the above copyright notice, this list of conditions and the"
            + " following disclaimer.";

    private static final String LICENSE_LINE_3 =
        "2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and"
            + " the following disclaimer in the documentation and/or other materials provided with the"
            + " distribution.";

    private static final String LICENSE_LINE_4 =
        "3. All advertising materials mentioning features or use of this software must display the following"
            + " acknowledgement:";

    public BSD4ClauseLicense() {
        super(new MetaData.Datum(RAT_URL_LICENSE_FAMILY_CATEGORY, "BSD-4-Clause"),
            new MetaData.Datum(RAT_URL_LICENSE_FAMILY_NAME, "BSD-4-Clause"), "BSD4ClauseLicense",
            LICENSE_LINE_1 + LICENSE_LINE_2 + LICENSE_LINE_3 + LICENSE_LINE_4);
    }
}

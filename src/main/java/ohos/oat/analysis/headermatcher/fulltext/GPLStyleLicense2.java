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

import ohos.oat.analysis.headermatcher.OhosContainTextMatchingLicense;
import ohos.oat.analysis.headermatcher.OhosMatchUtils;

import org.apache.rat.analysis.RatHeaderAnalysisException;
import org.apache.rat.api.Document;
import org.apache.rat.api.MetaData;

/**
 * Header matcher class for matching source code license headers
 *
 * @author chenyaxun
 * @since 1.0
 */
public class GPLStyleLicense2 extends OhosContainTextMatchingLicense {
    private static final String LICENSE_LINE_1 = "General Public License";

    public GPLStyleLicense2() {
        super(new MetaData.Datum(RAT_URL_LICENSE_FAMILY_CATEGORY, "GPLStyleLicense"),
            new MetaData.Datum(RAT_URL_LICENSE_FAMILY_NAME, "GPLStyleLicense"), "", GPLStyleLicense2.LICENSE_LINE_1);
    }

    @Override
    public boolean match(final Document pSubject, final String pLine) throws RatHeaderAnalysisException {
        final String value = pSubject.getMetaData().value(MetaData.RAT_URL_LICENSE_FAMILY_CATEGORY);
        if (OhosMatchUtils.stopWhileMatchedGPL(value)) {
            return false;
        }

        return super.match(pSubject, pLine);
    }
}
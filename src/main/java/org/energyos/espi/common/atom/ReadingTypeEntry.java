/*
 * Copyright 2013 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.energyos.espi.common.atom;

import org.energyos.espi.common.domain.ReadingType;

import com.sun.syndication.io.FeedException;

@SuppressWarnings("serial")
public class ReadingTypeEntry extends EspiEntry<ReadingType> {

    public ReadingTypeEntry(ReadingType espiObject) throws FeedException {
        super(espiObject);
    }

    @Override
    protected String getSelfHref() {
        return "ReadingType/" + espiObject.getId();
    }

    @Override
    protected String getUpHref() {
        return "ReadingType";
    }

    protected void buildRelatedLinks() {}
}
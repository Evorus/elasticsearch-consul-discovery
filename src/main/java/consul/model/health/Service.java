package consul.model.health;

/**
 * Copyright © 2015 Lithium Technologies, Inc. All rights reserved subject to the terms of
 * the MIT License located at
 *
 *
 * LICENSE FILE DISCLOSURE STATEMENT AND COPYRIGHT NOTICE This LICENSE.txt file sets forth
 * the general licensing terms and attributions for the “Elasticsearch Consul Discovery
 * plugin” project software provided by Lithium Technologies, Inc. (“Lithium”).  This
 * software is based upon certain software files authored by Grant Rodgers in 2015 as part
 * of the “Elasticsearch SRV discovery plugin” project.  As a result, some of the files in
 * this Elasticsearch Consul Discovery plugin” project software are wholly authored by
 * Lithium, some are wholly authored by Grant Rodgers, and others are originally authored
 * by Grant Rodgers and subsequently modified by Lithium.  Files that were either modified
 * or wholly authored by Lithium contain an additional LICENSE.txt file indicating whether
 * they were modified or wholly authored by Lithium.  Any LICENSE.txt files, copyrights or
 * attribution originally included in the files of the original “Elasticsearch SRV
 * discovery plugin” remain unchanged. Copyright Notices The following copyright notice
 * applies to only those files and modifications authored by Lithium: Copyright © 2015
 * Lithium Technologies, Inc.  All rights reserved subject to the terms of the MIT License
 * below. The following copyright notice applies to only those files in the original
 * “Elasticsearch SRV discovery plugin” project software excluding any modifications by
 * Lithium: Copyright (c) 2015 Grant Rodgers License The following MIT License, as
 * originally presented in the “Elasticsearch SRV discovery plugin” project software, also
 * applies to files authored or modified by Lithium.  Your use of the “Elasticsearch
 * Consul Discovery plugin” project software is therefore subject to the terms of the
 * following MIT License.  Except as may be granted herein or by separate express written
 * agreement, this file provides no license to any Lithium patents, trademarks,
 * copyrights, or other intellectual property. MIT License Permission is hereby granted,
 * free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to permit persons to
 * whom the Software is furnished to do so, subject to the following conditions: The above
 * copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software. THE SOFTWARE IS PROVIDED "AS IS", WITHOUT
 * WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT
 * SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
 * IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 *
 *
 * Created by Jigar Joshi on 8/9/15.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Consul service class.
 */
public class Service {
    private String address;
    private String id;
    private Integer port;
    private String service;
    private List<String> tags = new ArrayList<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Service service = (Service) o;

        if (address != null ? !address.equals(service.address) : service.address != null) {
            return false;
        }
        if (id != null ? !id.equals(service.id) : service.id != null) {
            return false;
        }
        if (port != null ? !port.equals(service.port) : service.port != null) {
            return false;
        }
        if (this.service != null ? !this.service.equals(service.service) : service.service != null) {
            return false;
        }
        if (tags != null ? !tags.equals(service.tags) : service.tags != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + (service != null ? service.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        return result;
    }
}

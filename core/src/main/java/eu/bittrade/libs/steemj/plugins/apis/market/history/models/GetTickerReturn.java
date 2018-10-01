/*
 *     This file is part of SteemJ (formerly known as 'Steem-Java-Api-Wrapper')
 * 
 *     SteemJ is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * 
 *     SteemJ is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 * 
 *     You should have received a copy of the GNU General Public License
 *     along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.bittrade.libs.steemj.plugins.apis.market.history.models;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

<<<<<<< HEAD:core/src/main/java/eu/bittrade/libs/steemj/plugins/apis/market/history/models/GetTickerReturn.java
import eu.bittrade.libs.steemj.protocol.Asset;
=======
import eu.bittrade.libs.steemj.base.models.Asset;
import eu.bittrade.libs.steemj.interfaces.HasJsonAnyGetterSetter;
>>>>>>> 0.4.x:core/src/main/java/eu/bittrade/libs/steemj/apis/market/history/model/MarketTicker.java

/**
 * This class represents a Steem "get_ticker_return" object of the
 * "market_history_plugin".
 * 
 * @author <a href="http://steemit.com/@dez1337">dez1337</a>
 */
<<<<<<< HEAD:core/src/main/java/eu/bittrade/libs/steemj/plugins/apis/market/history/models/GetTickerReturn.java
public class GetTickerReturn {
    @JsonProperty("latest")
=======
public class MarketTicker implements HasJsonAnyGetterSetter {
	private final Map<String, Object> _anyGetterSetterMap = new HashMap<>();
	@Override
	public Map<String, Object> _getter() {
		return _anyGetterSetterMap;
	}

	@Override
	public void _setter(String key, Object value) {
		_getter().put(key, value);
	}

>>>>>>> 0.4.x:core/src/main/java/eu/bittrade/libs/steemj/apis/market/history/model/MarketTicker.java
    private double latest;
    @JsonProperty("lowest_ask")
    private double lowestAsk;
    @JsonProperty("highest_bid")
    private double highestBid;
    @JsonProperty("percent_change")
    private double percentChange;
    @JsonProperty("steem_volume")
    private Asset steemVolume;
    @JsonProperty("sbd_volume")
    private Asset sbdVolume;

    /**
     * This object is only used to wrap the JSON response in a POJO, so
     * therefore this class should not be instantiated.
     */
    protected GetTickerReturn() {
    }

    /**
     * @return the latest
     */
    public double getLatest() {
        return latest;
    }

    /**
     * @return the lowestAsk
     */
    public double getLowestAsk() {
        return lowestAsk;
    }

    /**
     * @return the highestBid
     */
    public double getHighestBid() {
        return highestBid;
    }

    /**
     * @return the percentChange
     */
    public double getPercentChange() {
        return percentChange;
    }

    /**
     * @return the steemVolume
     */
    public Asset getSteemVolume() {
        return steemVolume;
    }

    /**
     * @return the sbdVolume
     */
    public Asset getSbdVolume() {
        return sbdVolume;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

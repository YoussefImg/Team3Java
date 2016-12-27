package model;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class Subscription
{
	private UUID subscriptionID;
	private UUID railCardID;
	private UUID routeID;
	private UUID discountID;
	private Date validFrom;
	private Date validUntil;
	private RailCard railCard;
	private Route route;
	private Discount discount;
	private long lastUpdated;
	
	public Subscription()
	{}

	public Subscription(UUID railID, UUID routeID, Date validFrom, Date validUntil)
	{
		this.railCardID = railID;
		this.routeID = routeID;
		this.validFrom = validFrom;
		this.validUntil = validUntil;
		this.subscriptionID = UUID.randomUUID();
		this.lastUpdated = Instant.now().getEpochSecond();
	}

	public Subscription(UUID railID, UUID routeID, UUID discountID, Date validFrom, Date validUntil)
	{
		this.railCardID = railID;
		this.routeID = routeID;
		this.discountID = discountID;
		this.validFrom = validFrom;
		this.validUntil = validUntil;
		this.subscriptionID = UUID.randomUUID();
		this.lastUpdated = Instant.now().getEpochSecond();
	}

	public UUID getSubscriptionID()
	{
		return subscriptionID;
	}

	public void setSubscriptionID(UUID subscriptionID)
	{
		this.subscriptionID = subscriptionID;
	}

	public UUID getRailCardID()
	{
		return railCardID;
	}

	public void setRailCardID(UUID railCardID)
	{
		this.railCardID = railCardID;
	}

	public UUID getRouteID()
	{
		return routeID;
	}

	public void setRouteID(UUID routeID)
	{
		this.routeID = routeID;
	}

	public UUID getDiscountID()
	{
		return discountID;
	}

	public void setDiscountID(UUID discountID)
	{
		this.discountID = discountID;
	}

	public Date getValidFrom()
	{
		return validFrom;
	}

	public void setValidFrom(Date validFrom)
	{
		this.validFrom = validFrom;
	}

	public Date getValidUntil()
	{
		return validUntil;
	}

	public void setValidUntil(Date validUntil)
	{
		this.validUntil = validUntil;
	}

	public RailCard getRailCard()
	{
		return railCard;
	}

	public void setRailCard(RailCard railCard)
	{
		this.railCard = railCard;
	}

	public Route getRoute()
	{
		return route;
	}

	public void setRoute(Route route)
	{
		this.route = route;
	}

	public Discount getDiscount()
	{
		return discount;
	}

	public void setDiscount(Discount discount)
	{
		this.discount = discount;
	}

	public long getLastUpdated()
	{
		return lastUpdated;
	}

	public void setLastUpdated(long lastUpdated)
	{
		this.lastUpdated = lastUpdated;
	}

	public void update()
	{
		this.lastUpdated = Instant.now().getEpochSecond();
	}

}

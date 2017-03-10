# VWAPCalculator #

Calculate VWAP for an instrument when a Market update tick is received for that instrument from any market.

Assumption Indicative Market update provides price that is not tradable hence will be ignored from the calculation of VWAP. 
Bid and Offer Amount fits within range for double. 
VWAPTwoWayPrice is always FIRM side.

VWAP - Volume Weighted Average Price
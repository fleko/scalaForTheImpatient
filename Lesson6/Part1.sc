val zones = java.util.TimeZone.getAvailableIDs

zones.map(_.split("/"))
  .filter(_.length>1)
  .map(_(1))
  .grouped(10)
  .toArray
  .map(_(0))
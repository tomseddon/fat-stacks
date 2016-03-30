import yahoofinance.YahooFinance
import scala.collection.JavaConversions._

object StockPrices {

  def main(args: Array[String]) {

    val symbols = Array("^FTSE", "^N225", "^AORD", "^HSI", "^NDX","^GDAXI","^HSI")
    val stocks = YahooFinance.get(symbols).toList

    println(stocks)
  }

}

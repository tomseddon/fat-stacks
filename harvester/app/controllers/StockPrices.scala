package controllers

import yahoofinance.YahooFinance
import yahoofinance.quotes.stock.StockQuote

import scala.collection.JavaConversions._

object StockPrices {

  def getLatest(): List[StockQuote] = {

    val symbols = Array("^FTSE", "^N225", "^AORD", "^HSI", "^NDX","^GDAXI","^HSI")
    YahooFinance.get(symbols).toList.map{case (name,stock) => stock.getQuote}

  }

}

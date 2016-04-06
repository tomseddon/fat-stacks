package controllers

import yahoofinance.YahooFinance
import yahoofinance.quotes.stock.StockQuote

import scala.collection.JavaConversions._

object StockPrices {

  def getLatest(): List[StockQuote] = {

    val symbols = Array("^FTSE", "^N225", "^AORD", "^HSI", "^NDX","^GDAXI","^HSI","CBA.AX","WBC.AX","ANZ.AX","NAB.AX","TLS.AX","BHP.AX","WES.AX","CSL.AX","WOW.AX","SCG.AX","MQG.AX","TCL.AX","WPL.AX","WFD.AX","BXB.AX","RIO.AX","AMP.AX","AMC.AX","SUN.AX","QBE.AX","SYD.AX","NCM.AX","IAG.AX","RHC.AX","VCX.AX","AGL.AX","GMG.AX","CIM.AX","OSH.AX","RMD.AX","SGP.AX","APA.AX","ORG.AX","TPM.AX","CWN.AX","GPT.AX","AIO.AX","CTX.AX","FMG.AX","QAN.AX","LLC.AX","S32.AX","AZJ.AX","JHX.AX","ASX.AX","DXS.AX","MPL.AX","SHL.AX","REA.AX","MGR.AX","STO.AX","TWE.AX","CCL.AX","ALL.AX","ORI.AX","COH.AX","SPK.AX","CPU.AX","TTS.AX","SEK.AX","IPL.AX","AST.AX","DUE.AX","HVN.AX","DMP.AX","FPH.AX","FBU.AX","CGF.AX","SGR.AX","BOQ.AX","BLD.AX","HSO.AX","FLT.AX","BEN.AX","VOC.AX","PTM.AX","AWC.AX","MFG.AX","TAH.AX","BSL.AX","SKI.AX","ABC.AX","ILU.AX","HGG.AX","BTT.AX","ORA.AX","BKL.AX","CAR.AX","CYB.AX","LNK.AX","ANN.AX","SKC.AX","IFL.AX","IOF.AX","DLX.AX","EVN.AX","QUB.AX","PMV.AX","MQA.AX","REC.AX","BKW.AX","JBH.AX","NST.AX","BWP.AX","NUF.AX","ALQ.AX","PPT.AX","FXJ.AX","CHC.AX","PRY.AX","NVT.AX","MYO.AX","GOZ.AX","CMW.AX","CQR.AX","IRE.AX","AOG.AX","SKT.AX","GNC.AX","SGM.AX","SUL.AX","ABP.AX","SVW.AX","SCP.AX","CSR.AX","SRX.AX","OZL.AX","MTS.AX","IGO.AX","DOW.AX","SWM.AX","REG.AX","TME.AX","GMA.AX","TNE.AX","PGH.AX","GEM.AX","NEC.AX","IVC.AX","SDF.AX","WOR.AX","CTD.AX","SPO.AX","BPT.AX","AHG.AX","RRL.AX","IPH.AX","CWY.AX","SBM.AX","MYX.AX","MIN.AX","MTR.AX","ARB.AX","EHE.AX","BAP.AX","APO.AX","MMS.AX","MSB.AX","AHY.AX","SIP.AX","MYR.AX","BAL.AX","BRG.AX","FXL.AX","SYR.AX","NWS.AX","SFR.AX","CGC.AX","ACX.AX","BGA.AX","AAD.AX","PBG.AX","API.AX","SXL.AX","RFG.AX","GXL.AX","VRL.AX","JHC.AX","WHC.AX","SAI.AX","ALU.AX","AAC.AX","ISD.AX","GTY.AX","BRS.AX","MND.AX","APN.AX","GWA.AX","GUD.AX","TGR.AX","WSA.AX","NSR.AX","ASB.AX","CVO.AX","VRT.AX","OFX.AX","CCP.AX","PRG.AX","SHV.AX","LNG.AX","AAL.L","ABF.L","ADM.L","AHT.L","ANTO.L","ARM.L","AV.L","AZN.L","BA.L","BAB.L","BARC.L","BATS.L","BDEV.L","BKG.L","BLND.L","BLT.L","BNZL.L","BP.L","BRBY.L","BT-A.L","CCH.L","CCL.L","CNA.L","CPG.L","CPI.L","CRH.L","DC.L","DCC.L","DGE.L","DLG.L","EXPN.L","EZJ.L","FRES.L","GKN.L","GLEN.L","GSK.L","HL.L","HMSO.L","HSBA.L","IAG.L","IHG.L","III.L","IMB.L","INF.L","INTU.L","ISAT.L","ITRK.L","ITV.L","JMAT.L","KGF.L","MMM","AXP","AAP","BA","CAT","CVX","CSC","KO","DIS","DD","XOM","GE","GS","HD","IBM","INT","JNJ","JPM","MCD","MRK","MSF","NKE","PFE","PG","TRV","UTX","UNH","VZ","V","WMT")
    YahooFinance.get(symbols).toList.map{case (name,stock) => stock.getQuote}

  }

}

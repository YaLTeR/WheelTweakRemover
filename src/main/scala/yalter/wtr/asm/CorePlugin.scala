package yalter.wtr.asm

import java.util

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions

@TransformerExclusions(Array("yalter.wtr.asm"))
class CorePlugin extends IFMLLoadingPlugin {
  override def getASMTransformerClass: Array[String] = Array("yalter.wtr.asm.Transformer")

  override def injectData(map: util.Map[String, AnyRef]): Unit = {}

  override def getModContainerClass: String = "yalter.wtr.asm.ModContainer"

  override def getAccessTransformerClass: String = null

  override def getSetupClass: String = null
}

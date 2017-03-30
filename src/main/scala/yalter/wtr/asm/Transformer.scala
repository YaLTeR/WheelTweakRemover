package yalter.wtr.asm

import net.minecraft.launchwrapper.IClassTransformer
import org.objectweb.asm.{ClassReader, ClassWriter}

class Transformer extends IClassTransformer {
  override def transform(name: String, transformedName: String, basicClass: Array[Byte]): Array[Byte] = {
    if (name != "codechicken.nei.NEIController")
      return basicClass

    val cr = new ClassReader(basicClass)
    val cw = new ClassWriter(cr, ClassWriter.COMPUTE_FRAMES)
    cr.accept(new NEIControllerVisitor(cw), 0)

    cw.toByteArray
  }
}

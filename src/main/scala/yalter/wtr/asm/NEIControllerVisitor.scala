package yalter.wtr.asm

import org.objectweb.asm.{ClassVisitor, ClassWriter, MethodVisitor, Opcodes}

class NEIControllerVisitor(cw: ClassWriter) extends ClassVisitor(Opcodes.ASM5, cw) {

  override def visitMethod(access: Int, name: String, desc: String, signature: String, exceptions: Array[String]): MethodVisitor = {
    val mv = super.visitMethod(access, name, desc, signature, exceptions)

    if (name == "mouseScrolled" && mv != null) {
      mv.visitCode()
      mv.visitInsn(Opcodes.ICONST_0)
      mv.visitInsn(Opcodes.IRETURN)
      mv.visitMaxs(0, 0)
      mv.visitEnd()

      println("[Wheel Tweak Remover] Removed Not Enough Items' wheel tweak.")

      return null
    }

    mv
  }

}

package yalter.wtr.asm

import java.util

import net.minecraftforge.fml.common.{DummyModContainer, ModMetadata}

class ModContainer extends DummyModContainer(new ModMetadata) {
  // Extra block so that meta doesn't become a class member.
  {
    val meta = this.getMetadata
    meta.authorList = util.Arrays asList "YaLTeR"
    meta.description = "Removes wheel tweak functionality from mods other than Mouse Tweaks."
    meta.modId = "wheeltweakremover"
    meta.name = "Wheel Tweak Remover"
    meta.version = "1.0"
  }
}

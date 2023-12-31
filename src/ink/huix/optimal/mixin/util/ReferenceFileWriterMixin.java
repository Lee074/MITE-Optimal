package ink.huix.optimal.mixin.util;

import net.minecraft.ReferenceFileWriter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ReferenceFileWriter.class)
public class ReferenceFileWriterMixin {
    @ModifyConstant(method = {
            "writeBlockMaterialFile",
            "writeBlockConstantsFile",
            "writeBlockHardnessFile",
            "writeBlockMetadataFile",
            "writeBlockDissolveTimeFile",
            "writeSilkHarvestFile",
            "writeHarvestLevelFile",
            "writeToolDecayRateFiles",
            "writeToolHarvestEfficiencyFiles",
            "writeBlockOpacityFile",
            "writeIsOpaqueStandardFormCubeFile",
            "writeNormalCubeFile",
            "writeBlockMetadataToSubtypeFile",
            "writeAllowsGrassBeneathFile",
            "writeUseNeighborBrightnessFile",
            "writeBlockRenderTypeFile"
    }, constant = @Constant(intValue = 256))
    private static int injected(int value) {
        return 1024;
    }
}

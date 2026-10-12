jadx.core.utils.exceptions.JadxRuntimeException: Failed to generate code for class: com.luchime.huiyuan.ui.HuiyuanAppKt
	at jadx.core.ProcessClass.generateCode(ProcessClass.java:133)
	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code generation error after restart
	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:52)
	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
	at jadx.core.ProcessClass.process(ProcessClass.java:89)
	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
	... 3 more
Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:348)
	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002b: MOVE_EXCEPTION (r0v0 'th' java.lang.Throwable A[CUSTOM_DECLARE]) =  A[DONT_INLINE, ExcHandler: all -> 0x002b] in method: com.luchime.huiyuan.ui.HuiyuanAppKt.toTimelineMessage(com.luchime.huiyuan.ChatRecord):com.luchime.huiyuan.ui.TimelineItem$Message, file: classes5.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
	at jadx.core.dex.regions.Region.generate(Region.java:35)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:383)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
	at jadx.core.dex.regions.Region.generate(Region.java:35)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
	... 5 more
Caused by: jadx.core.utils.exceptions.CodegenException: MOVE_EXCEPTION instruction can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:698)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:561)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
	... 22 more


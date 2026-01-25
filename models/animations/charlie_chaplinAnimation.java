// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.0.7 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class charlie_chaplinAnimation {
	public static final AnimationDefinition cammina = AnimationDefinition.Builder.withLength(1.11F).looping()
			.addAnimation("gambasx",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2775F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.555F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.8325F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.11F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("gambadx",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2775F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.555F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.8325F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.11F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bracciosx",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2775F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.555F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.8325F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.11F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bracciodx",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2775F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.555F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.8325F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.11F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("tutto",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2775F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.555F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.8325F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.5F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.11F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();
}
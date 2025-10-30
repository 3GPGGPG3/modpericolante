
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.cum.entity.VirusEntity;
import net.mcreator.cum.entity.V2Entity;
import net.mcreator.cum.entity.V1Entity;
import net.mcreator.cum.entity.UomoPrimitivoEntity;
import net.mcreator.cum.entity.StrayEntity;
import net.mcreator.cum.entity.StellinaDelGodoNegativaEntity;
import net.mcreator.cum.entity.StellinaDelGodoEntity;
import net.mcreator.cum.entity.StellaPericolosaProiettileEntity;
import net.mcreator.cum.entity.SpadaGabriellanteLanciataEntity;
import net.mcreator.cum.entity.SisyphusPrimeEntity;
import net.mcreator.cum.entity.SemiSparatiEntity;
import net.mcreator.cum.entity.ScheggiaDiPietraBalatranteProjectileEntity;
import net.mcreator.cum.entity.RedCummEntity;
import net.mcreator.cum.entity.PuntaleSparatoEntity;
import net.mcreator.cum.entity.PuntaleNegativoSparatoEntity;
import net.mcreator.cum.entity.PlasmacellulaEntity;
import net.mcreator.cum.entity.Pericolante7Entity;
import net.mcreator.cum.entity.Pericolante6Entity;
import net.mcreator.cum.entity.Pericolante5Entity;
import net.mcreator.cum.entity.Pericolante4Entity;
import net.mcreator.cum.entity.Pericolante3Entity;
import net.mcreator.cum.entity.Pericolante2Entity;
import net.mcreator.cum.entity.Pericolante1Entity;
import net.mcreator.cum.entity.PerInv3Entity;
import net.mcreator.cum.entity.PerInv2Entity;
import net.mcreator.cum.entity.PerInv1Entity;
import net.mcreator.cum.entity.PeashooterEntity;
import net.mcreator.cum.entity.PaperonDePaperoniEntity;
import net.mcreator.cum.entity.OliviaEntity;
import net.mcreator.cum.entity.NocciolinaEntity;
import net.mcreator.cum.entity.MirabellaEntity;
import net.mcreator.cum.entity.MinosPrimeEntity;
import net.mcreator.cum.entity.MattiaPascalEntity;
import net.mcreator.cum.entity.MaliciousFaceEntity;
import net.mcreator.cum.entity.LinfocitaTEntity;
import net.mcreator.cum.entity.LinfocitaBEntity;
import net.mcreator.cum.entity.KillerEntity;
import net.mcreator.cum.entity.IlFuMattiaPascal2Entity;
import net.mcreator.cum.entity.GirasoleEntity;
import net.mcreator.cum.entity.GdCubeEntity;
import net.mcreator.cum.entity.GabrielEntity;
import net.mcreator.cum.entity.FrenziedCumProjectileEntity;
import net.mcreator.cum.entity.FlashPanopticomEntity;
import net.mcreator.cum.entity.FireballStrayProjEntity;
import net.mcreator.cum.entity.FilfhErrEntity;
import net.mcreator.cum.entity.FilfhEntity;
import net.mcreator.cum.entity.EsserePerfettamenteInutileEntity;
import net.mcreator.cum.entity.DiFazioEntity;
import net.mcreator.cum.entity.DaveEntity;
import net.mcreator.cum.entity.CumEntity;
import net.mcreator.cum.entity.AssassinaDeiNeriColtelliEntity;
import net.mcreator.cum.entity.AnticorpoEntity;
import net.mcreator.cum.entity.AltPiercerBeamEntity;
import net.mcreator.cum.entity.AlessandroManzoniEntity;
import net.mcreator.cum.entity.AdrianoMeisEntity;
import net.mcreator.cum.CumMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CumModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CumMod.MODID);
	public static final RegistryObject<EntityType<CumEntity>> CUM = register("cum",
			EntityType.Builder.<CumEntity>of(CumEntity::new, MobCategory.MISC).setCustomClientFactory(CumEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DiFazioEntity>> DI_FAZIO = register("di_fazio",
			EntityType.Builder.<DiFazioEntity>of(DiFazioEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DiFazioEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MirabellaEntity>> MIRABELLA = register("mirabella",
			EntityType.Builder.<MirabellaEntity>of(MirabellaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MirabellaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<V1Entity>> V_1 = register("v_1",
			EntityType.Builder.<V1Entity>of(V1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(V1Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Pericolante1Entity>> PERICOLANTE_1 = register("pericolante_1",
			EntityType.Builder.<Pericolante1Entity>of(Pericolante1Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Pericolante1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Pericolante2Entity>> PERICOLANTE_2 = register("pericolante_2",
			EntityType.Builder.<Pericolante2Entity>of(Pericolante2Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Pericolante2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Pericolante3Entity>> PERICOLANTE_3 = register("pericolante_3",
			EntityType.Builder.<Pericolante3Entity>of(Pericolante3Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Pericolante3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Pericolante4Entity>> PERICOLANTE_4 = register("pericolante_4", EntityType.Builder.<Pericolante4Entity>of(Pericolante4Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Pericolante4Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Pericolante5Entity>> PERICOLANTE_5 = register("pericolante_5", EntityType.Builder.<Pericolante5Entity>of(Pericolante5Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Pericolante5Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StellinaDelGodoEntity>> STELLINA_DEL_GODO = register("stellina_del_godo", EntityType.Builder.<StellinaDelGodoEntity>of(StellinaDelGodoEntity::new, MobCategory.MISC)
			.setCustomClientFactory(StellinaDelGodoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StellinaDelGodoNegativaEntity>> STELLINA_DEL_GODO_NEGATIVA = register("stellina_del_godo_negativa",
			EntityType.Builder.<StellinaDelGodoNegativaEntity>of(StellinaDelGodoNegativaEntity::new, MobCategory.MISC).setCustomClientFactory(StellinaDelGodoNegativaEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RedCummEntity>> RED_CUMM = register("red_cumm",
			EntityType.Builder.<RedCummEntity>of(RedCummEntity::new, MobCategory.MISC).setCustomClientFactory(RedCummEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KillerEntity>> KILLER = register("killer",
			EntityType.Builder.<KillerEntity>of(KillerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(KillerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<V2Entity>> V_2 = register("v_2",
			EntityType.Builder.<V2Entity>of(V2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(V2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Pericolante6Entity>> PERICOLANTE_6 = register("pericolante_6", EntityType.Builder.<Pericolante6Entity>of(Pericolante6Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Pericolante6Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Pericolante7Entity>> PERICOLANTE_7 = register("pericolante_7", EntityType.Builder.<Pericolante7Entity>of(Pericolante7Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(Pericolante7Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AlessandroManzoniEntity>> ALESSANDRO_MANZONI = register("alessandro_manzoni",
			EntityType.Builder.<AlessandroManzoniEntity>of(AlessandroManzoniEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(95).setUpdateInterval(3).setCustomClientFactory(AlessandroManzoniEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SisyphusPrimeEntity>> SISYPHUS_PRIME = register("sisyphus_prime", EntityType.Builder.<SisyphusPrimeEntity>of(SisyphusPrimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(SisyphusPrimeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MinosPrimeEntity>> MINOS_PRIME = register("minos_prime", EntityType.Builder.<MinosPrimeEntity>of(MinosPrimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100)
			.setUpdateInterval(3).setCustomClientFactory(MinosPrimeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VirusEntity>> VIRUS = register("virus",
			EntityType.Builder.<VirusEntity>of(VirusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VirusEntity::new)

					.sized(0.2f, 0.2f));
	public static final RegistryObject<EntityType<FlashPanopticomEntity>> FLASH_PANOPTICOM = register("flash_panopticom",
			EntityType.Builder.<FlashPanopticomEntity>of(FlashPanopticomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlashPanopticomEntity::new)

					.sized(1.3f, 143f));
	public static final RegistryObject<EntityType<LinfocitaBEntity>> LINFOCITA_B = register("linfocita_b",
			EntityType.Builder.<LinfocitaBEntity>of(LinfocitaBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LinfocitaBEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<PlasmacellulaEntity>> PLASMACELLULA = register("plasmacellula",
			EntityType.Builder.<PlasmacellulaEntity>of(PlasmacellulaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlasmacellulaEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<AnticorpoEntity>> ANTICORPO = register("anticorpo",
			EntityType.Builder.<AnticorpoEntity>of(AnticorpoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AnticorpoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EsserePerfettamenteInutileEntity>> ESSERE_PERFETTAMENTE_INUTILE = register("essere_perfettamente_inutile",
			EntityType.Builder.<EsserePerfettamenteInutileEntity>of(EsserePerfettamenteInutileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EsserePerfettamenteInutileEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LinfocitaTEntity>> LINFOCITA_T = register("linfocita_t",
			EntityType.Builder.<LinfocitaTEntity>of(LinfocitaTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LinfocitaTEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<FilfhEntity>> FILFH = register("filfh",
			EntityType.Builder.<FilfhEntity>of(FilfhEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FilfhEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireballStrayProjEntity>> FIREBALL_STRAY_PROJ = register("fireball_stray_proj", EntityType.Builder.<FireballStrayProjEntity>of(FireballStrayProjEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FireballStrayProjEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AltPiercerBeamEntity>> ALT_PIERCER_BEAM = register("alt_piercer_beam",
			EntityType.Builder.<AltPiercerBeamEntity>of(AltPiercerBeamEntity::new, MobCategory.MISC).setCustomClientFactory(AltPiercerBeamEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ScheggiaDiPietraBalatranteProjectileEntity>> SCHEGGIA_DI_PIETRA_BALATRANTE_PROJECTILE = register("scheggia_di_pietra_balatrante_projectile",
			EntityType.Builder.<ScheggiaDiPietraBalatranteProjectileEntity>of(ScheggiaDiPietraBalatranteProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ScheggiaDiPietraBalatranteProjectileEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<OliviaEntity>> OLIVIA = register("olivia",
			EntityType.Builder.<OliviaEntity>of(OliviaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OliviaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PaperonDePaperoniEntity>> PAPERON_DE_PAPERONI = register("paperon_de_paperoni",
			EntityType.Builder.<PaperonDePaperoniEntity>of(PaperonDePaperoniEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PaperonDePaperoniEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MattiaPascalEntity>> MATTIA_PASCAL = register("mattia_pascal",
			EntityType.Builder.<MattiaPascalEntity>of(MattiaPascalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MattiaPascalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AdrianoMeisEntity>> ADRIANO_MEIS = register("adriano_meis",
			EntityType.Builder.<AdrianoMeisEntity>of(AdrianoMeisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(200).setUpdateInterval(3).setCustomClientFactory(AdrianoMeisEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IlFuMattiaPascal2Entity>> IL_FU_MATTIA_PASCAL_2 = register("il_fu_mattia_pascal_2",
			EntityType.Builder.<IlFuMattiaPascal2Entity>of(IlFuMattiaPascal2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(200).setUpdateInterval(3).setCustomClientFactory(IlFuMattiaPascal2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FilfhErrEntity>> FILFH_ERR = register("filfh_err",
			EntityType.Builder.<FilfhErrEntity>of(FilfhErrEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FilfhErrEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GabrielEntity>> GABRIEL = register("gabriel",
			EntityType.Builder.<GabrielEntity>of(GabrielEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(200).setUpdateInterval(3).setCustomClientFactory(GabrielEntity::new)

					.sized(0.6f, 2.2f));
	public static final RegistryObject<EntityType<SpadaGabriellanteLanciataEntity>> SPADA_GABRIELLANTE_LANCIATA = register("spada_gabriellante_lanciata",
			EntityType.Builder.<SpadaGabriellanteLanciataEntity>of(SpadaGabriellanteLanciataEntity::new, MobCategory.MISC).setCustomClientFactory(SpadaGabriellanteLanciataEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.7f, 0.7f));
	public static final RegistryObject<EntityType<MaliciousFaceEntity>> MALICIOUS_FACE = register("malicious_face", EntityType.Builder.<MaliciousFaceEntity>of(MaliciousFaceEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(70).setUpdateInterval(3).setCustomClientFactory(MaliciousFaceEntity::new).fireImmune().sized(0.9f, 1.8f));
	public static final RegistryObject<EntityType<GdCubeEntity>> GD_CUBE = register("gd_cube",
			EntityType.Builder.<GdCubeEntity>of(GdCubeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GdCubeEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<StrayEntity>> STRAY = register("stray",
			EntityType.Builder.<StrayEntity>of(StrayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StrayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StellaPericolosaProiettileEntity>> STELLA_PERICOLOSA_PROIETTILE = register("stella_pericolosa_proiettile",
			EntityType.Builder.<StellaPericolosaProiettileEntity>of(StellaPericolosaProiettileEntity::new, MobCategory.MISC).setCustomClientFactory(StellaPericolosaProiettileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<UomoPrimitivoEntity>> UOMO_PRIMITIVO = register("uomo_primitivo",
			EntityType.Builder.<UomoPrimitivoEntity>of(UomoPrimitivoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UomoPrimitivoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PerInv1Entity>> PER_INV_1 = register("per_inv_1",
			EntityType.Builder.<PerInv1Entity>of(PerInv1Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerInv1Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AssassinaDeiNeriColtelliEntity>> ASSASSINA_DEI_NERI_COLTELLI = register("assassina_dei_neri_coltelli",
			EntityType.Builder.<AssassinaDeiNeriColtelliEntity>of(AssassinaDeiNeriColtelliEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AssassinaDeiNeriColtelliEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PerInv2Entity>> PER_INV_2 = register("per_inv_2",
			EntityType.Builder.<PerInv2Entity>of(PerInv2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerInv2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PerInv3Entity>> PER_INV_3 = register("per_inv_3",
			EntityType.Builder.<PerInv3Entity>of(PerInv3Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PerInv3Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PuntaleSparatoEntity>> PUNTALE_SPARATO = register("puntale_sparato",
			EntityType.Builder.<PuntaleSparatoEntity>of(PuntaleSparatoEntity::new, MobCategory.MISC).setCustomClientFactory(PuntaleSparatoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PuntaleNegativoSparatoEntity>> PUNTALE_NEGATIVO_SPARATO = register("puntale_negativo_sparato", EntityType.Builder.<PuntaleNegativoSparatoEntity>of(PuntaleNegativoSparatoEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PuntaleNegativoSparatoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PeashooterEntity>> PEASHOOTER = register("peashooter",
			EntityType.Builder.<PeashooterEntity>of(PeashooterEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PeashooterEntity::new)

					.sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<SemiSparatiEntity>> SEMI_SPARATI = register("semi_sparati",
			EntityType.Builder.<SemiSparatiEntity>of(SemiSparatiEntity::new, MobCategory.MISC).setCustomClientFactory(SemiSparatiEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<DaveEntity>> DAVE = register("dave",
			EntityType.Builder.<DaveEntity>of(DaveEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DaveEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NocciolinaEntity>> NOCCIOLINA = register("nocciolina",
			EntityType.Builder.<NocciolinaEntity>of(NocciolinaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NocciolinaEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<GirasoleEntity>> GIRASOLE = register("girasole",
			EntityType.Builder.<GirasoleEntity>of(GirasoleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GirasoleEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<FrenziedCumProjectileEntity>> FRENZIED_CUM_PROJECTILE = register("frenzied_cum_projectile", EntityType.Builder.<FrenziedCumProjectileEntity>of(FrenziedCumProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FrenziedCumProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DiFazioEntity.init();
			MirabellaEntity.init();
			V1Entity.init();
			Pericolante1Entity.init();
			Pericolante2Entity.init();
			Pericolante3Entity.init();
			Pericolante4Entity.init();
			Pericolante5Entity.init();
			KillerEntity.init();
			V2Entity.init();
			Pericolante6Entity.init();
			Pericolante7Entity.init();
			AlessandroManzoniEntity.init();
			SisyphusPrimeEntity.init();
			MinosPrimeEntity.init();
			VirusEntity.init();
			FlashPanopticomEntity.init();
			LinfocitaBEntity.init();
			PlasmacellulaEntity.init();
			AnticorpoEntity.init();
			EsserePerfettamenteInutileEntity.init();
			LinfocitaTEntity.init();
			FilfhEntity.init();
			OliviaEntity.init();
			PaperonDePaperoniEntity.init();
			MattiaPascalEntity.init();
			AdrianoMeisEntity.init();
			IlFuMattiaPascal2Entity.init();
			FilfhErrEntity.init();
			GabrielEntity.init();
			MaliciousFaceEntity.init();
			GdCubeEntity.init();
			StrayEntity.init();
			UomoPrimitivoEntity.init();
			PerInv1Entity.init();
			AssassinaDeiNeriColtelliEntity.init();
			PerInv2Entity.init();
			PerInv3Entity.init();
			PeashooterEntity.init();
			DaveEntity.init();
			NocciolinaEntity.init();
			GirasoleEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DI_FAZIO.get(), DiFazioEntity.createAttributes().build());
		event.put(MIRABELLA.get(), MirabellaEntity.createAttributes().build());
		event.put(V_1.get(), V1Entity.createAttributes().build());
		event.put(PERICOLANTE_1.get(), Pericolante1Entity.createAttributes().build());
		event.put(PERICOLANTE_2.get(), Pericolante2Entity.createAttributes().build());
		event.put(PERICOLANTE_3.get(), Pericolante3Entity.createAttributes().build());
		event.put(PERICOLANTE_4.get(), Pericolante4Entity.createAttributes().build());
		event.put(PERICOLANTE_5.get(), Pericolante5Entity.createAttributes().build());
		event.put(KILLER.get(), KillerEntity.createAttributes().build());
		event.put(V_2.get(), V2Entity.createAttributes().build());
		event.put(PERICOLANTE_6.get(), Pericolante6Entity.createAttributes().build());
		event.put(PERICOLANTE_7.get(), Pericolante7Entity.createAttributes().build());
		event.put(ALESSANDRO_MANZONI.get(), AlessandroManzoniEntity.createAttributes().build());
		event.put(SISYPHUS_PRIME.get(), SisyphusPrimeEntity.createAttributes().build());
		event.put(MINOS_PRIME.get(), MinosPrimeEntity.createAttributes().build());
		event.put(VIRUS.get(), VirusEntity.createAttributes().build());
		event.put(FLASH_PANOPTICOM.get(), FlashPanopticomEntity.createAttributes().build());
		event.put(LINFOCITA_B.get(), LinfocitaBEntity.createAttributes().build());
		event.put(PLASMACELLULA.get(), PlasmacellulaEntity.createAttributes().build());
		event.put(ANTICORPO.get(), AnticorpoEntity.createAttributes().build());
		event.put(ESSERE_PERFETTAMENTE_INUTILE.get(), EsserePerfettamenteInutileEntity.createAttributes().build());
		event.put(LINFOCITA_T.get(), LinfocitaTEntity.createAttributes().build());
		event.put(FILFH.get(), FilfhEntity.createAttributes().build());
		event.put(OLIVIA.get(), OliviaEntity.createAttributes().build());
		event.put(PAPERON_DE_PAPERONI.get(), PaperonDePaperoniEntity.createAttributes().build());
		event.put(MATTIA_PASCAL.get(), MattiaPascalEntity.createAttributes().build());
		event.put(ADRIANO_MEIS.get(), AdrianoMeisEntity.createAttributes().build());
		event.put(IL_FU_MATTIA_PASCAL_2.get(), IlFuMattiaPascal2Entity.createAttributes().build());
		event.put(FILFH_ERR.get(), FilfhErrEntity.createAttributes().build());
		event.put(GABRIEL.get(), GabrielEntity.createAttributes().build());
		event.put(MALICIOUS_FACE.get(), MaliciousFaceEntity.createAttributes().build());
		event.put(GD_CUBE.get(), GdCubeEntity.createAttributes().build());
		event.put(STRAY.get(), StrayEntity.createAttributes().build());
		event.put(UOMO_PRIMITIVO.get(), UomoPrimitivoEntity.createAttributes().build());
		event.put(PER_INV_1.get(), PerInv1Entity.createAttributes().build());
		event.put(ASSASSINA_DEI_NERI_COLTELLI.get(), AssassinaDeiNeriColtelliEntity.createAttributes().build());
		event.put(PER_INV_2.get(), PerInv2Entity.createAttributes().build());
		event.put(PER_INV_3.get(), PerInv3Entity.createAttributes().build());
		event.put(PEASHOOTER.get(), PeashooterEntity.createAttributes().build());
		event.put(DAVE.get(), DaveEntity.createAttributes().build());
		event.put(NOCCIOLINA.get(), NocciolinaEntity.createAttributes().build());
		event.put(GIRASOLE.get(), GirasoleEntity.createAttributes().build());
	}
}

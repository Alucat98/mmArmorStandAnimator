package com.gmail.berndivader.mmArmorStandAnimator;

import io.lumine.xikage.mythicmobs.adapters.AbstractEntity;
import io.lumine.xikage.mythicmobs.io.MythicLineConfig;
import io.lumine.xikage.mythicmobs.skills.SkillCondition;
import io.lumine.xikage.mythicmobs.skills.conditions.ConditionAction;
import io.lumine.xikage.mythicmobs.skills.conditions.IEntityCondition;

public class mmArmorStandPauseCondition extends SkillCondition implements IEntityCondition {
	
	public mmArmorStandPauseCondition(String line, MythicLineConfig mlc) {
		super(line);
		this.setAction(ConditionAction.TRUE);
	}

	@Override
	public boolean check(AbstractEntity entity) {
		return ArmorStandUtils.isAnimationPaused(entity);
	}
}

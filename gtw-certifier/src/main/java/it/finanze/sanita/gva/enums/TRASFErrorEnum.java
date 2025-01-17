/*
 * SPDX-License-Identifier: AGPL-3.0-or-later
 */
package it.finanze.sanita.gva.enums;

import it.finanze.sanita.gva.validator.IUC;

public enum TRASFErrorEnum implements IUC{

	SECTION_CODE("001"),
	SECTION_CODE_SYSTEM("002"),
	SECTION_CODE_SYSTEM_NAME("003"),
	SECTION_DISPLAY_NAME("004"),
	SECTION_COMPONENT_CODE("005"),
	SECTION_COMPONENT_CODE_SYSTEM("006"),
	SECTION_COMPONENT_CODE_SYSTEM_NAME("007"),
	SECTION_COMPONENT_DISPLAY_NAME("008"),
	SECTION_COMPONENT_TYPE_CODE("009"),
	SECTION_COMPONENT_ACT_MOODE_CODE("010"),
	SECTION_COMPONENT_ACT_CLASS_CODE("011"),
	SECTION_COMPONENT_ACT_STATUS_CODE("012"),
	SECTION_COMPONENT_ACT_SPECIMENROLE_TYPE_CODE("013"),
	SECTION_COMPONENT_ACT_SPECIMENROLE_CLASS_CODE("014"),
	SECTION_COMPONENT_ACT_SPECIMENROLE_CODE("015"),
	SECTION_COMPONENT_ACT_SPECIMENROLE_CODE_SYSTEM("015"),
	SECTION_COMPONENT_ACT_SPECIMENROLE_CODE_SYSTEM_NAME("016"),
	SECTION_COMPONENT_ACT_SPECIMENROLE_DISPLAY_NAME("017"),
	SECTION_COMPONENT_ACT_TYPE_CODE("018"),
	SECTION_COMPONENT_ACT_ORG_CLASS_CODE("019"),
	SECTION_COMPONENT_ACT_ORG_STATUS_CODE("020"),
	SECTION_COMPONENT_ACT_ORG_TYPE_CODE("021"),
	SECTION_COMPONENT_ACT_ORG_CODE("022"),
	SECTION_COMPONENT_ACT_ORG_DISPLAY_NAME("023"),
	SECTION_COMPONENT_ACT_ORG_OBS_STATUS_CODE("024"),
	SECTION_COMPONENT_ACT_ORG_OBS_CODE("025"),
	SECTION_COMPONENT_ACT_ORG_OBS_CODE_SYSTEM("026"),
	SECTION_COMPONENT_ACT_ORG_OBS_CODE_SYSTEM_NAME("027"),
	SECTION_COMPONENT_ACT_ORG_OBS_DISPLAY_NAME("028"),
	SECTION_COMPONENT_ACT_ORG_COMP_TYPE_CODE("029"),
	SECTION_COMPONENT_ACT_ORG_COMP_CODE("030"),
	SECTION_COMPONENT_ACT_ORG_COMP_CODE_SYSYTEM("031"),
	SECTION_COMPONENT_ACT_ORG_COMP_CODE_SYSTEM_NAME("032"),
	SECTION_COMPONENT_ACT_ORG_COMP_DISPLAY_NAME("033"),
	SECTION_COMPONENT_ACT_ORG_COMP_STATUS_CODE("034"),
	SECTION_COMPONENT_ACT_ORG_COMP_OBS_CODE("035"),
	SECTION_COMPONENT_ACT_ORG_COMP_OBS_CODE_SYSTEM("036"),
	SECTION_COMPONENT_ACT_ORG_COMP_OBS_CODE_SYSTEM_NAME("037"),
	SECTION_COMPONENT_ACT_ORG_COMP_OBS_DISPLAY_NAME("038"),
	SECTION_COMPONENT_ACT_ORG_COMP_OBS_STATUS_CODE("039"),
	SECTION_COMPONENT_ACT_ER_TYPEC_ODE("040"),
	SECTION_COMPONENT_ACT_ER_CLASS_CODE("041"),
	SECTION_COMPONENT_ACT_ER_MOOD_CODE("042"),
	SECTION_COMPONENT_ACT_ER_CODE("043"),
	SECTION_COMPONENT_ACT_ER_CODE_SYSTEM("044"),
	SECTION_COMPONENT_ACT_ER_CODE_SYSTEM_NAME("045"),
	SECTION_COMPONENT_ACT_ER_DISPLAY_NAME("046"),
	SECTION_COMPONENT_ACT_ORG_CODE_SYSTEM("047"),
	SECTION_COMPONENT_ACT_ORG_CODE_SYSTEM_NAME("048");
	
	private String code;
	
	private TRASFErrorEnum(String inCode) {
		code = inCode;
	}
	
	public String getCode() {
		return code;
	}

}

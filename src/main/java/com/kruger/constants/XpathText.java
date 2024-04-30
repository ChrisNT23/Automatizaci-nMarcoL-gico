package com.kruger.constants;

/**
 * The XpathText enum represents the text values used in XPath expressions to locate elements on the UI.
 * It provides a set of predefined text values for various UI elements.
 */
public enum XpathText {
    NAME("Nombre *"),
    MANAGEMENT_MODEL("Modelo de Gesti"),
    COVERAGE("Cobertura *"),
    INVESTMENT_TYPE("Tipo de inversi"),
    INTERVENTION_SUB_SECTOR("Subsector de intervenci"),
    INVESTMENT_GUIDELINE("Lineamiento de Inversi"),
    REQUEST_TYPE("Tipo de Solicitud de Dictamen *"),
    PARTICIPANTS("Participantes"),
    EMBLEMATIC("proyecto emblem"),
    ENDORSEMENT("Aval"),
    ENVIRONMENTAL_SHEET("ficha ambiental"),
    BINATIONAL_COOPERATION("Binacional"),
    MANAGER("gerente"),
    RESPONSIBLE("Responsable del "),
    RESPONSIBLE_POSITION("Cargo del Responsable *"),
    EMAIL("Correo Electr"),
    ADDITIONAL_EMAIL("nico Adicional *"),
    HIGHEST_AUTHORITY_RESPONSIBLE("Responsable M"),
    HIGHEST_AUTHORITY_EMAIL("Correo M"),
    PRODUCT("Producto"),
    PRODUCT_DETAIL("Detalle producto *"),
    GENERAL_DATA_TAB("Datos generales"),
    LOGIC_FRAME_TAB("Marco L"),
    SAVE_BUTTON("Guardar"),
    END_TAB("Fin"),
    PURPOSE_TAB("Prop"),
    COMPONENTS_TAB("Componentes"),
    VERIFICATION_METHODS_TAB("Medios de verificaci"),
    ASSUMPTIONS_TAB("Supuestos"),
    ACTIVITIES_TAB("Actividades"),
    FINANCING_SOURCES_TAB("Fuentes de financiamiento"),
    ADD_CAUSE_BUTTON("Agregar causa"),
    CAUSE_TEXT_BOX("Causa"),
    ADD_EFFECT_BUTTON("Agregar efecto"),
    EFFECT_TEXT_BOX("Efecto"),
    ADD_COMPONENT_BUTTON("Agregar componente"),
    COMPONENT_TEXT_BOX("Componente"),
    ADD_ACTIVITY_BUTTON("Agregar actividad"),
    ACTIVITY_TEXT_BOX("Actividad"),
    END_INDICATORS_PLUS_BUTTON("finIndicadores"),
    END_VERIFICATION_METHODS_PLUS_BUTTON("finMediosVerificacion"),
    END_ASSUMPTIONS_PLUS_BUTTON("finSupuestos"),
    PURPOSE_INDICATORS_PLUS_BUTTON("input-Indicadores"),
    MEASURING_UNIT_DROPDOWN("Unidad de medida"),
    OTHER_UNITS_TEXT_BOX("Otras unidades"),
    ACCEPT_BUTTON("Aceptar"),
    PURPOSE_VERIFICATION_METHODS_PLUS_BUTTON("propositoMediosVerificacion"),
    PURPOSE_ASSUMPTIONS_PLUS_BUTTON("propositoSupuestos"),
    FINANCING_SOURCE_DROPDOWN("Fuente de financiamiento"),
    SPENDING_GROUP_DROPDOWN("Grupo Gasto"),
    BUDGET_ITEM_DROPDOWN("tem Presupuestario"),
    ADD_BUTTON("Agregar"),
    VALUED_SCHEDULE_TAB("Cronograma Valorado"),
    FINANCING_TAB("Cronograma Valorado"),
    GEOGRAPHIC_LOCATION_TAB("Ubicaci"),
    SELECTED_GEOGRAPHIC_LOCATION_TAB("Seleccionadas"),
    GEOGRAPHIC_LOCATION_COORDINATES("Coordenadas"),
    AMOUNT_INDEX("1"),
    BENEFICIARIES_INDEX("2"),
    ADD_COORDINATES_BUTTON("Search"),
    ADD_COORDINATES_FROM_MAP_BUTTON("Ingresar Coordenadas por Mapa"),
    INDICATORS_TAB("Indicadores"),
    FINANCIAL_FLOW_TEXT_BOX("Flujo financiero"),
    ECONOMICAL_FLOW_TEXT_BOX("Flujo econ"),
    INTEREST_GROWTH_RATE("Tasa Crecimiento Inter"),
    ADD_CAPITAL_EXPENSE_BUTTON("Agregar gasto de capital"),
    ADD_OPERATING_EXPENSE("Agregar gasto operativos"),
    ADD_ADMINISTRATIVE_EXPENSE("Agregar gasto administrativo"),
    ADD_MAINTENANCE_EXPENSE("Agregar gasto mantenimiento"),
    POPULATION_GROWTH_RATE("Tasa Crecimiento Poblaci"),
    ADD_BENEFITS_BUTTON("Agregar beneficio"),
    COUNTRY_LOSS_QUESTION("no se ejecuta"),
    RESULTS_IMPACTS_QUESTION("resultados o impactos"),
    DIRECT_MALE_BENEFICIARIES("Beneficiarios Directos Masculinos"),
    INDIRECT_BENEFICIARIES("Beneficiarios Indirectos"),
    MALE_AMOUNT_TEXT_BOX("priorMasculino"),
    FEMALE_AMOUNT_TEXT_BOX("priorFemenino"),
    ALIGNMENT_TAB("Alineaci"),
    FINANCIAL_FLOW_LABEL("Flujo financiero"),
    ECONOMICAL_FLOW_LABEL("Flujo econ"),
    PND_ALIGNMENT_TAB_OPTION("n al PND"),
    PROJECT_RELATIONSHIP_TAB_OPTION("Proyecto-Proyecto"),
    PND_ALIGNMENT_BUTTON("ALINEACION AL PND"),
    TECHNICAL_STUDIES_TAB("Estudios"),
    UPLOAD_FILE_BUTTON("Subir Archivo"),
    DICTUM_REQUEST_TAB("Solicitud de Dictamen"),
    SEND_REQUEST_BUTTON("Enviar Solicitud"),
    JUSTIFICATION_REPORT_CHECKBOX("INFORME JUSTIFICATIVO"),
    OTHER_CHECKBOX("OTROS"),
    CLOSE_BUTTON("Close"),
    SELECT_BUTTON("Seleccionar"),
    ASSIGN_USER_BUTTON("Asignar Usuario"),
    ANALYSIS_TYPE_DROPDOWN("Tipo de an"),
    COMPLIANCE_DROPDOWN("Seleccione"),
    ANALYSIS_TEXT_INPUT("lisis"),
    RECOMMENDATIONS_TEXT_INPUT("Recomendaciones"),
    CONCLUSIONS_TEXT_INPUT("Conclusiones"),
    APPROVE_REQUEST_BUTTON("Aprobar Solicitud"),
    ADD_COMPONENT_DETAIL_BUTTON("Actualizar componente"),
    ADD_ACTIVITY_DETAIL_BUTTON("Actualizar actividad");

    private final String text;

    /**
     * Constructs a new XpathText enum with the specified text.
     *
     * @param value The text value.
     */
    XpathText(String value) {
        this.text = value;
    }

    /**
     * Retrieves the text value.
     *
     * @return The text.
     */
    public String getText() {
        return text;
    }
}

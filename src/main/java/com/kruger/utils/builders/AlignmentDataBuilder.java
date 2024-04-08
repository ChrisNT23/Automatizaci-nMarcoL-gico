package com.kruger.utils.builders;

import com.kruger.entitys.AlignmentData;

import java.util.Map;

/**
 * The AlignmentDataBuilder class is responsible for building AlignmentData objects.
 */
public class AlignmentDataBuilder {
    private String goalName;
    private String projectType;
    private String projectRelatedName;

    public String getGoalName() {
        return goalName;
    }

    public String getProjectType() {
        return projectType;
    }

    public String getProjectRelatedName() {
        return projectRelatedName;
    }

    public AlignmentDataBuilder withGoal(String goal) {
        this.goalName = goal;
        return this;
    }

    public AlignmentDataBuilder withProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }

    public AlignmentDataBuilder withProjectName(String projectName) {
        this.projectRelatedName = projectName;
        return this;
    }

    /**
     * Sets the values from a map of data.
     *
     * @param data The map containing data.
     * @return The AlignmentDataBuilder instance.
     */
    public AlignmentDataBuilder fromMap(Map<String, String> data) {
        this.goalName = data.get("goalName");
        this.projectType = data.getOrDefault("projectType", "");
        this.projectRelatedName = data.getOrDefault("projectRelatedName", "");
        return this;
    }

    /**
     * Builds an AlignmentData object with the set values.
     *
     * @return The built AlignmentData object.
     */
    public AlignmentData build() {
        return new AlignmentData(this);
    }
}

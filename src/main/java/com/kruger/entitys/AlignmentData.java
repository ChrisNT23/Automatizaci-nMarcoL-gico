package com.kruger.entitys;

import com.kruger.utils.builders.AlignmentDataBuilder;

/**
 * The AlignmentData class represents alignment data used in conjunction with its builder class.
 * It encapsulates information about a goal name, project type, and related project name.
 */
public class AlignmentData {
    private final String goalName;
    private final String projectType;
    private final String projectRelatedName;

    /**
     * Constructs a new AlignmentData instance with the provided builder.
     *
     * @param builder The builder containing alignment data.
     */
    public AlignmentData(AlignmentDataBuilder builder) {
        goalName = builder.getGoalName();
        projectType = builder.getProjectType();
        projectRelatedName = builder.getProjectRelatedName();
    }

    /**
     * Retrieves a new instance of AlignmentDataBuilder to facilitate object construction.
     *
     * @return A new instance of AlignmentDataBuilder.
     */
    public static AlignmentDataBuilder builder() {
        return new AlignmentDataBuilder();
    }

    public String getGoalName() {
        return goalName;
    }

    public String getProjectType() {
        return projectType;
    }

    public String getProjectRelatedName() {
        return projectRelatedName;
    }

}

package io.schultz.dustin.todoapp.customEndpoints;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class ProjectInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        //add new info
        builder.withDetail("project_name", "...")
                .withDetail("owned_by_team", "...")
                .withDetail("point_od_contact","...");
    }
}

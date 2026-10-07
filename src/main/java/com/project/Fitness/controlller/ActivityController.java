package com.project.Fitness.controlller;

import com.project.Fitness.dto.ActivityRequest;
import com.project.Fitness.dto.ActivityResponse;
import com.project.Fitness.service.ActivityService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping
@Data
public class ActivityController {

    private final ActivityService activityService;

    @PostMapping("/api/activities")
    public ResponseEntity<ActivityResponse> trackActivity(
            @RequestBody ActivityRequest request){
        return ResponseEntity.ok(activityService.trackActivity(request));
    }

    @GetMapping("/api/activties")
    public ResponseEntity<List<ActivityResponse>> createActivity(
            @RequestBody ActivityResponse activityResponse){
        return ResponseEntity.ok(activityService.createActivity(activityResponse));
    }

}

package com.project.Fitness.controlller;

import com.project.Fitness.dto.RecommendationRequest;
import com.project.Fitness.model.Recommendation;
import com.project.Fitness.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendation")
@RequiredArgsConstructor
public class RecommendationController  {

    private final  RecommendationService recommendationService;

    @PostMapping("/generate")
    public ResponseEntity<Recommendation> generateRecommendation(
            @RequestBody RecommendationRequest request
    ){
        Recommendation recommendation = recommendationService.generateRecommendation(request);
        return ResponseEntity.ok(recommendation);
    }


    @GetMapping("user/{userId}")
    public ResponseEntity<List<Recommendation>> getUserRecommendations(
            @PathVariable String userId){
        List<Recommendation> recommendationList = recommendationService.getUserRecommendations(userId);
        return ResponseEntity.ok(recommendationList);
    }

    @GetMapping("/activity/{activityId}")
    public ResponseEntity<List<Recommendation>> getActivityRecommendations(
            @PathVariable String activityId){
        List<Recommendation> recommendationList
                = recommendationService.getActivityReccomendation(activityId);
                return ResponseEntity.ok(recommendationList);
    }
}

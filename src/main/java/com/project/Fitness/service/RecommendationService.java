package com.project.Fitness.service;

import com.project.Fitness.dto.RecommendationRequest;
import com.project.Fitness.model.Activity;
import com.project.Fitness.model.Recommendation;
import com.project.Fitness.model.User;
import com.project.Fitness.repository.ActivityRepository;
import com.project.Fitness.repository.RecommendationRepository;
import com.project.Fitness.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendationService {

    private final UserRepository userRepository;
    private final ActivityRepository activityRepository;
    private final RecommendationRepository recommendationRepository;

    public Recommendation generateRecommendation(RecommendationRequest request) {

        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() ->
                        new RuntimeException(
                                "User not found: " + request.getUserId()
                        ));

        Activity activity = activityRepository.findById(request.getActivityId())
                .orElseThrow(() ->
                        new RuntimeException(
                                "Activity not found: " + request.getActivityId()
                        ));

        Recommendation recommendation = Recommendation.builder()
                .user(user)
                .activity(activity)
                .improvements(request.getImprovements())
                .suggestions(request.getSuggestions())
                .safety(request.getSafety())
                .build();

        return recommendationRepository.save(recommendation);
    }

    public List<Recommendation> getUserRecommendations(String userId) {
      return recommendationRepository.findByUserId(userId);
    }


    public List<Recommendation> getActivityReccomendation(String activityId) {
        return recommendationRepository.findByActivityId(activityId);

    }
}
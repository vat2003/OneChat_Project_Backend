package com.project.shopapp.Service;

import com.project.shopapp.entity.FriendRequest;

public interface FriendRequestService {
    FriendRequest createFriendRequest(FriendRequest frrquest);

    void deleteFriendRequest(Long frrquest_id);
}

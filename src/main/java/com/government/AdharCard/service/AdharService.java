package com.government.AdharCard.service;

import com.government.AdharCard.entity.AdharUsers;
import com.government.AdharCard.repository.AdharRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdharService {

    @Autowired
    private AdharRepo repo;

    public List<AdharUsers> getAllUsers()
    {
        return repo.findAll();
    }

    public void addUsers(AdharUsers users)
    {
        repo.save(users);
    }

    public AdharUsers getUserById(int id)
    {
        Optional<AdharUsers> users=repo.findById(id);
        if(users.isPresent()){
            return users.get();
        }
        return null;
    }

    public void deleteUser(int id)
    {
        repo.deleteById(id);
    }
}

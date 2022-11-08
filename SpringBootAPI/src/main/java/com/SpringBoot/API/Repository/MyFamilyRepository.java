
package com.SpringBoot.API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.API.Entity.MyFamilyDetails;

@Repository
public interface MyFamilyRepository extends JpaRepository<MyFamilyDetails, Integer> {

}

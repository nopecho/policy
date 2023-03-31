package com.nopecho.policy.action.adapters.out.persistence;

import com.nopecho.policy.domain.ActionHistory;
import com.nopecho.policy.domain.HistoryStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActionHistoryRepository extends JpaRepository<ActionHistory, Long> {

    List<ActionHistory> findByStatus(HistoryStatus status);
}
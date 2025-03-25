package com.xrontech.web.domain.attendance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance,Long> {
    Optional<Attendance> findByDate(LocalDate date);
    List<Attendance> findAllByEmployeeId(Long id);

    List<Attendance> findAlByDate(LocalDate date);

    Attendance findByEmployeeIdAndDate(Long userId, LocalDate date);
}

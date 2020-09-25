package com.homework22.repository;



import com.homework22.models.Laptop;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LaptopRepository extends PagingAndSortingRepository<Laptop, Long> {
    List<Laptop> findAllByMemoryAfter(int memory);

    List<Laptop> findAllByUsed(boolean isUsed);
}

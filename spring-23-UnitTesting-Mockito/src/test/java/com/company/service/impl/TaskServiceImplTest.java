package com.company.service.impl;

import com.company.dto.TaskDTO;
import com.company.entity.Task;
import com.company.mapper.TaskMapper;
import com.company.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TaskServiceImplTest {

    @Mock
    TaskRepository taskRepository;
    @Mock
    TaskMapper taskMapper;

    @InjectMocks
    TaskServiceImpl taskService;


    @ParameterizedTest
    @ValueSource(longs = {1L, 2L, 3L})
    void findById_Test(long id) {
        //Given(Preparation of the test)
        Task task = new Task();
        //When (Action is performed)
        when(taskRepository.findById(id)).thenReturn(Optional.of(task)); //Optional<Task>
        when(taskMapper.convertToDto(task)).thenReturn(new TaskDTO());
        taskService.findById(id);

        //Then (Assertion and Verification)
        verify(taskRepository).findById(id);
        verify(taskMapper).convertToDto(task);
    }

    @Test
    void findById_BDD_Test() {
        //Given(Preparation of the test)
        Task task = new Task();
        //When (Action is performed)
        given(taskRepository.findById(anyLong())).willReturn(Optional.of(task)); //Optional<Task>
        given(taskMapper.convertToDto(task)).willReturn(new TaskDTO());

        taskService.findById(anyLong());

        //Then (Assertion and Verification)
        then(taskRepository).should().findById(anyLong());
        then(taskMapper).should(atLeastOnce()).convertToDto(task);



}
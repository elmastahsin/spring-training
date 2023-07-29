package com.company.service.impl;

import com.company.dto.ProjectDTO;
import com.company.entity.Project;
import com.company.service.ProjectService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.company.mapper.ProjectMapper;
import com.company.repository.ProjectRepository;
import com.company.service.ProjectService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class ProjectServiceImplTest {

    @Mock
    ProjectRepository projectRepository;
    @Mock
    ProjectMapper projectMapper;
    @Mock
    ProjectService projectService;

    @Test
    void getByProjectCodeTest() {
        when(projectRepository.findByProjectCode(anyString())).thenReturn(new Project());//stubbing
        when(projectMapper.convertToDto(any(Project.class))).thenReturn(new ProjectDTO());

        ProjectDTO projectDTO = projectService.getByProjectCode(anyString());

        InOrder inOrder = inOrder(projectRepository, projectMapper);

        inOrder.verify(projectRepository).findByProjectCode(anyString());
        inOrder.verify(projectMapper).convertToDto(any(Project.class));

        assertNotNull(projectDTO);
    }


}
package com.exercise.practice.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.practice.Model.Doctor;
import com.exercise.practice.Model.Patient;
import com.exercise.practice.Repo.DoctorRepo;
import com.exercise.practice.Repo.PatientRepo;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorRepo docrepo;
	
	@Autowired
	private PatientRepo patrepo;
	
	@GetMapping
	public List<Doctor>getAll(){
		return docrepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Doctor get(@PathVariable("id") String id) {
		return docrepo.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Doctor doctor) {
		docrepo.save(doctor);
	}
	
	@PutMapping
	public void update(@RequestBody Doctor doctor) {
		docrepo.save(doctor);
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		docrepo.deleteById(id);
	}
	
	@PostMapping("/{id}/addpatient")
	public void addPatient(@PathVariable("id") String docid,@RequestBody Map<String,String>patientmap){
		Doctor doctor=docrepo.findById(docid).get();
		Patient patient=patrepo.findById(patientmap.get("patientid")).get();
		
		doctor.getPatients().add(patient);
		docrepo.save(doctor);
	}
}

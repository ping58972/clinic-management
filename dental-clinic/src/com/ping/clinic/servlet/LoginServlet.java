package com.ping.clinic.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ping.clinic.pojo.Appointment;
import com.ping.clinic.pojo.Dentist;
import com.ping.clinic.pojo.Patient;
import com.ping.clinic.pojo.ScheduleDentist;
import com.ping.clinic.service.AppointmentService;
import com.ping.clinic.service.DentistTableService;
import com.ping.clinic.service.LoginService;
import com.ping.clinic.service.PatientService;
import com.ping.clinic.service.ScheduleService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginService loginService = new LoginService();
	private DentistTableService dentistTableService = new DentistTableService();
    private AppointmentService appointmentService = new AppointmentService();
    private PatientService patentService = new PatientService();
    private ScheduleService scheduleService = new ScheduleService();


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean status = loginService.validateUser(username, password);
		if(status) {
			List<Dentist> dentistsList = dentistTableService.getDentistTable();
			List<Appointment> appointmentsList = appointmentService.getAppointmentsTable();
			List<Patient> patientList = patentService.getPatients();
			List<ScheduleDentist> scheduleList = scheduleService.getScheduleDentists();
			request.setAttribute("username", username);
			request.setAttribute("dentistsList", dentistsList);
			request.setAttribute("appList", appointmentsList);
			request.setAttribute("patientList", patientList);
			request.setAttribute("scheduleList", scheduleList);
			request.getRequestDispatcher("show-table.jsp").forward(request, response);
		} else {
			response.sendRedirect("login.jsp");
		}
	}

}

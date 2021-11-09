
package Vista_Lote;

import Controlador_lote.DepartamentoController;
import Controlador_lote.EmpresaController;
import Controlador_lote.OrdenController;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmPrincipal extends javax.swing.JFrame
{
    public EmpresaController objEmpresaController;
    public DepartamentoController objDepartamentoController;
    public OrdenController objOrdenController;
    
    public FrmPrincipal() 
    {
        initComponents();
        inicializarOtrosComponentes();
    }
    
    private void inicializarOtrosComponentes()
    {
        objEmpresaController = new EmpresaController(this);
        objDepartamentoController = new DepartamentoController(this);
        objOrdenController = new OrdenController(this);

        pnlBaseParaEmpresa.setVisible(false);
        pnlBaseAsignacionCostos.setVisible(false);
        
        pnlHorasMO.setVisible(false);
        pnlHorasMA.setVisible(false);
        
        pnlOrdenMO.setVisible(false);
        pnlOrdenMA.setVisible(false);
        
        btnLlenarBasesDepartamentos.setEnabled(false);
        
        btnGenerarOrden.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jtppGeneralidadDepartamento = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnCrearEmpresa = new javax.swing.JButton();
        btnCrearEmpleado2 = new javax.swing.JButton();
        txtNombreEmpresa = new javax.swing.JTextField();
        cboTipoCifa = new javax.swing.JComboBox<>();
        cboModalidad = new javax.swing.JComboBox<>();
        pnlBaseParaEmpresa = new javax.swing.JPanel();
        cboBaseParaEmpresa = new javax.swing.JComboBox<>();
        btnAgregarBase = new javax.swing.JButton();
        pnlBaseAsignacionCostos = new javax.swing.JPanel();
        cboBaseAsignacionCosto = new javax.swing.JComboBox<>();
        btnEstablecerBase = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtCIReales = new javax.swing.JTextField();
        txtCIPresupuestado = new javax.swing.JTextField();
        txtNombreDepartamento = new javax.swing.JTextField();
        pnlHorasMO = new javax.swing.JPanel();
        txtHMOPresupuestadas = new javax.swing.JTextField();
        txtHMOReales = new javax.swing.JTextField();
        btnAgregarDepartamento = new javax.swing.JButton();
        pnlHorasMA = new javax.swing.JPanel();
        txtHMaquinaPresupuestadas = new javax.swing.JTextField();
        txtHMaquinaReales = new javax.swing.JTextField();
        btnEstablecerDepartamentos = new javax.swing.JButton();
        pnlBaseParaTasaDepartamental = new javax.swing.JPanel();
        cboBaseParaTasaDep = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtUnidades = new javax.swing.JTextField();
        txtImporteMaterialDirecto = new javax.swing.JTextField();
        txtNumeroOrden = new javax.swing.JTextField();
        btnCrearOrden = new javax.swing.JButton();
        pnlOrdenMO = new javax.swing.JPanel();
        txtHMO = new javax.swing.JTextField();
        txtCostoPorHMO = new javax.swing.JTextField();
        pnlOrdenMA = new javax.swing.JPanel();
        txtHMaquina = new javax.swing.JTextField();
        txtCostoPorHMaquina = new javax.swing.JTextField();
        btnLlenarBasesDepartamentos = new javax.swing.JButton();
        btnGenerarOrden = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        pnlHojaCostos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atHojaCostos = new javax.swing.JTextArea();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Generales"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearEmpresa.setText("Crear Empresa");
        btnCrearEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpresaActionPerformed(evt);
            }
        });
        jPanel3.add(btnCrearEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 190, 52));

        btnCrearEmpleado2.setText("Crear Empresa");
        btnCrearEmpleado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpleado2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnCrearEmpleado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 190, 52));

        txtNombreEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel3.add(txtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 57));

        cboTipoCifa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----No Seleccionado-----", "Predeterminado", "Departamental" }));
        cboTipoCifa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tipo Cifa"));
        jPanel3.add(cboTipoCifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 185, 60));

        cboModalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----No Seleccionado-----", "Real", "Presupuestado", "Real y Presupuestado" }));
        cboModalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Modalidad"));
        jPanel3.add(cboModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 185, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 670, 200));

        pnlBaseParaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Bases para la Empresa"));

        cboBaseParaEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----No Seleccionado-----", "Mano de Obra", "Maquinaria" }));
        cboBaseParaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Base"));

        btnAgregarBase.setText("Agregar Base");
        btnAgregarBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBaseParaEmpresaLayout = new javax.swing.GroupLayout(pnlBaseParaEmpresa);
        pnlBaseParaEmpresa.setLayout(pnlBaseParaEmpresaLayout);
        pnlBaseParaEmpresaLayout.setHorizontalGroup(
            pnlBaseParaEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseParaEmpresaLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(cboBaseParaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnAgregarBase, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        pnlBaseParaEmpresaLayout.setVerticalGroup(
            pnlBaseParaEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseParaEmpresaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlBaseParaEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboBaseParaEmpresa)
                    .addComponent(btnAgregarBase, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(pnlBaseParaEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 670, -1));

        pnlBaseAsignacionCostos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Base de Asignación de Costos"));

        cboBaseAsignacionCosto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Base"));

        btnEstablecerBase.setText("Establecer BASE");
        btnEstablecerBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstablecerBaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBaseAsignacionCostosLayout = new javax.swing.GroupLayout(pnlBaseAsignacionCostos);
        pnlBaseAsignacionCostos.setLayout(pnlBaseAsignacionCostosLayout);
        pnlBaseAsignacionCostosLayout.setHorizontalGroup(
            pnlBaseAsignacionCostosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseAsignacionCostosLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(cboBaseAsignacionCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnEstablecerBase, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        pnlBaseAsignacionCostosLayout.setVerticalGroup(
            pnlBaseAsignacionCostosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseAsignacionCostosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlBaseAsignacionCostosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboBaseAsignacionCosto)
                    .addComponent(btnEstablecerBase, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(pnlBaseAsignacionCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 670, -1));

        jtppGeneralidadDepartamento.addTab("Empresa", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Generales Departamento"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCIReales.setBorder(javax.swing.BorderFactory.createTitledBorder("Costos Indirectos Reales"));
        jPanel5.add(txtCIReales, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 210, 57));

        txtCIPresupuestado.setBorder(javax.swing.BorderFactory.createTitledBorder("Costos Indirectos Presupuestados"));
        jPanel5.add(txtCIPresupuestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 240, 57));

        txtNombreDepartamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel5.add(txtNombreDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, 57));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 670, 120));

        pnlHorasMO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Mano de Obra"));

        txtHMOPresupuestadas.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas MO Presupuestadas"));

        txtHMOReales.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas MO Reales"));

        javax.swing.GroupLayout pnlHorasMOLayout = new javax.swing.GroupLayout(pnlHorasMO);
        pnlHorasMO.setLayout(pnlHorasMOLayout);
        pnlHorasMOLayout.setHorizontalGroup(
            pnlHorasMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHorasMOLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(txtHMOPresupuestadas, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(txtHMOReales, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        pnlHorasMOLayout.setVerticalGroup(
            pnlHorasMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHorasMOLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlHorasMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHMOPresupuestadas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHMOReales, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.add(pnlHorasMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 670, 110));

        btnAgregarDepartamento.setText("Agregar Departamento");
        btnAgregarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDepartamentoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 190, 52));

        pnlHorasMA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Maquinaria"));

        txtHMaquinaPresupuestadas.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas Máquina Presupuestadas"));

        txtHMaquinaReales.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas Máquina Reales"));

        javax.swing.GroupLayout pnlHorasMALayout = new javax.swing.GroupLayout(pnlHorasMA);
        pnlHorasMA.setLayout(pnlHorasMALayout);
        pnlHorasMALayout.setHorizontalGroup(
            pnlHorasMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHorasMALayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(txtHMaquinaPresupuestadas, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(txtHMaquinaReales, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        pnlHorasMALayout.setVerticalGroup(
            pnlHorasMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHorasMALayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlHorasMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHMaquinaPresupuestadas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHMaquinaReales, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.add(pnlHorasMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 670, 110));

        btnEstablecerDepartamentos.setText("Establecer Departamentos a la empresa");
        btnEstablecerDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstablecerDepartamentosActionPerformed(evt);
            }
        });
        jPanel2.add(btnEstablecerDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 270, 52));

        pnlBaseParaTasaDepartamental.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Base para Tasa Departamental"));

        cboBaseParaTasaDep.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Base para Tasa dep"));

        javax.swing.GroupLayout pnlBaseParaTasaDepartamentalLayout = new javax.swing.GroupLayout(pnlBaseParaTasaDepartamental);
        pnlBaseParaTasaDepartamental.setLayout(pnlBaseParaTasaDepartamentalLayout);
        pnlBaseParaTasaDepartamentalLayout.setHorizontalGroup(
            pnlBaseParaTasaDepartamentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseParaTasaDepartamentalLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(cboBaseParaTasaDep, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        pnlBaseParaTasaDepartamentalLayout.setVerticalGroup(
            pnlBaseParaTasaDepartamentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseParaTasaDepartamentalLayout.createSequentialGroup()
                .addComponent(cboBaseParaTasaDep, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(pnlBaseParaTasaDepartamental, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 670, 90));

        jtppGeneralidadDepartamento.addTab("Generalidad Departamento", jPanel2);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Generales de la Orden"));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUnidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Unidades"));
        jPanel9.add(txtUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 190, 57));

        txtImporteMaterialDirecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Material Directo"));
        jPanel9.add(txtImporteMaterialDirecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 200, 57));

        txtNumeroOrden.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nro"));
        jPanel9.add(txtNumeroOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 57));

        btnCrearOrden.setText("Crear Orden");
        btnCrearOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearOrdenActionPerformed(evt);
            }
        });
        jPanel9.add(btnCrearOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 190, 52));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 670, 190));

        pnlOrdenMO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Mano de Obra"));

        txtHMO.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas MO "));

        txtCostoPorHMO.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo por Hora MO"));

        javax.swing.GroupLayout pnlOrdenMOLayout = new javax.swing.GroupLayout(pnlOrdenMO);
        pnlOrdenMO.setLayout(pnlOrdenMOLayout);
        pnlOrdenMOLayout.setHorizontalGroup(
            pnlOrdenMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdenMOLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(txtHMO, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(txtCostoPorHMO, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        pnlOrdenMOLayout.setVerticalGroup(
            pnlOrdenMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdenMOLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlOrdenMOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHMO, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoPorHMO, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel7.add(pnlOrdenMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 670, 110));

        pnlOrdenMA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Maquinaria"));

        txtHMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas Máquina"));

        txtCostoPorHMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo por Hora Máquina"));

        javax.swing.GroupLayout pnlOrdenMALayout = new javax.swing.GroupLayout(pnlOrdenMA);
        pnlOrdenMA.setLayout(pnlOrdenMALayout);
        pnlOrdenMALayout.setHorizontalGroup(
            pnlOrdenMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdenMALayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(txtHMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(txtCostoPorHMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        pnlOrdenMALayout.setVerticalGroup(
            pnlOrdenMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdenMALayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlOrdenMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoPorHMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel7.add(pnlOrdenMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 670, 110));

        btnLlenarBasesDepartamentos.setText("Llenar Bases del Departamento ");
        btnLlenarBasesDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarBasesDepartamentosActionPerformed(evt);
            }
        });
        jPanel7.add(btnLlenarBasesDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 220, 52));

        btnGenerarOrden.setText("Generar Orden");
        btnGenerarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarOrdenActionPerformed(evt);
            }
        });
        jPanel7.add(btnGenerarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 190, 52));

        jtppGeneralidadDepartamento.addTab("Orden", jPanel7);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHojaCostos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "HOJA DE COSTOS POR ORDEN"));

        atHojaCostos.setColumns(20);
        atHojaCostos.setRows(5);
        jScrollPane1.setViewportView(atHojaCostos);

        javax.swing.GroupLayout pnlHojaCostosLayout = new javax.swing.GroupLayout(pnlHojaCostos);
        pnlHojaCostos.setLayout(pnlHojaCostosLayout);
        pnlHojaCostosLayout.setHorizontalGroup(
            pnlHojaCostosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHojaCostosLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnlHojaCostosLayout.setVerticalGroup(
            pnlHojaCostosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHojaCostosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        jPanel12.add(pnlHojaCostos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 670, 550));

        jtppGeneralidadDepartamento.addTab("Hoja de Costos", jPanel12);

        getContentPane().add(jtppGeneralidadDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLlenarBasesDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarBasesDepartamentosActionPerformed
        try
        {
            objOrdenController.LlenarBaseDepartamentoController();
        } catch (CloneNotSupportedException ex) 
        {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLlenarBasesDepartamentosActionPerformed

    private void btnGenerarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarOrdenActionPerformed
        try
        {
            objOrdenController.GenerarOrdenController();
        } catch (CloneNotSupportedException ex)
        {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarOrdenActionPerformed

    private void btnEstablecerDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstablecerDepartamentosActionPerformed
        objEmpresaController.EstablecerDepartamentosController();
    }//GEN-LAST:event_btnEstablecerDepartamentosActionPerformed

    private void btnAgregarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDepartamentoActionPerformed
        try
        {
            objDepartamentoController.agregarController();
        } catch (CloneNotSupportedException ex)
        {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarDepartamentoActionPerformed

    private void btnEstablecerBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstablecerBaseActionPerformed
        objEmpresaController.EstablecerBaseAsignacionCostoController();
    }//GEN-LAST:event_btnEstablecerBaseActionPerformed

    private void btnAgregarBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBaseActionPerformed
        objEmpresaController.AgregarBaseController();
    }//GEN-LAST:event_btnAgregarBaseActionPerformed

    private void btnCrearEmpleado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEmpleado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearEmpleado2ActionPerformed

    private void btnCrearEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEmpresaActionPerformed
        objEmpresaController.CrearController();
    }//GEN-LAST:event_btnCrearEmpresaActionPerformed

    private void btnCrearOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearOrdenActionPerformed
        try 
        {
            objOrdenController.CrearController();
        } catch (CloneNotSupportedException ex)
        {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrearOrdenActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea atHojaCostos;
    private javax.swing.JButton btnAgregarBase;
    private javax.swing.JButton btnAgregarDepartamento;
    private javax.swing.JButton btnCrearEmpleado2;
    private javax.swing.JButton btnCrearEmpresa;
    private javax.swing.JButton btnCrearOrden;
    private javax.swing.JButton btnEstablecerBase;
    private javax.swing.JButton btnEstablecerDepartamentos;
    public javax.swing.JButton btnGenerarOrden;
    public javax.swing.JButton btnLlenarBasesDepartamentos;
    public javax.swing.JComboBox<String> cboBaseAsignacionCosto;
    public javax.swing.JComboBox<String> cboBaseParaEmpresa;
    public javax.swing.JComboBox<String> cboBaseParaTasaDep;
    public javax.swing.JComboBox<String> cboModalidad;
    public javax.swing.JComboBox<String> cboTipoCifa;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTabbedPane jtppGeneralidadDepartamento;
    public javax.swing.JPanel pnlBaseAsignacionCostos;
    public javax.swing.JPanel pnlBaseParaEmpresa;
    public javax.swing.JPanel pnlBaseParaTasaDepartamental;
    private javax.swing.JPanel pnlHojaCostos;
    public javax.swing.JPanel pnlHorasMA;
    public javax.swing.JPanel pnlHorasMO;
    public javax.swing.JPanel pnlOrdenMA;
    public javax.swing.JPanel pnlOrdenMO;
    public javax.swing.JTextField txtCIPresupuestado;
    public javax.swing.JTextField txtCIReales;
    public javax.swing.JTextField txtCostoPorHMO;
    public javax.swing.JTextField txtCostoPorHMaquina;
    public javax.swing.JTextField txtHMO;
    public javax.swing.JTextField txtHMOPresupuestadas;
    public javax.swing.JTextField txtHMOReales;
    public javax.swing.JTextField txtHMaquina;
    public javax.swing.JTextField txtHMaquinaPresupuestadas;
    public javax.swing.JTextField txtHMaquinaReales;
    public javax.swing.JTextField txtImporteMaterialDirecto;
    public javax.swing.JTextField txtNombreDepartamento;
    public javax.swing.JTextField txtNombreEmpresa;
    public javax.swing.JTextField txtNumeroOrden;
    public javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}

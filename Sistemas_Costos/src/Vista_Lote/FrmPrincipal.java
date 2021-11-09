
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Generales"));

        btnCrearEmpresa.setText("Crear Empresa");
        btnCrearEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpresaActionPerformed(evt);
            }
        });

        btnCrearEmpleado2.setText("Crear Empresa");
        btnCrearEmpleado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpleado2ActionPerformed(evt);
            }
        });

        txtNombreEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        cboTipoCifa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----No Seleccionado-----", "Predeterminado", "Departamental" }));
        cboTipoCifa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tipo Cifa"));

        cboModalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----No Seleccionado-----", "Real", "Presupuestado", "Real y Presupuestado" }));
        cboModalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Modalidad"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(cboModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(cboTipoCifa, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearEmpleado2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipoCifa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearEmpleado2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBaseParaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBaseAsignacionCostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlBaseParaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlBaseAsignacionCostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jtppGeneralidadDepartamento.addTab("Empresa", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Generales Departamento"));

        txtCIReales.setBorder(javax.swing.BorderFactory.createTitledBorder("Costos Indirectos Reales"));

        txtCIPresupuestado.setBorder(javax.swing.BorderFactory.createTitledBorder("Costos Indirectos Presupuestados"));

        txtNombreDepartamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtNombreDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtCIPresupuestado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtCIReales, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCIPresupuestado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCIReales, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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

        btnAgregarDepartamento.setText("Agregar Departamento");
        btnAgregarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDepartamentoActionPerformed(evt);
            }
        });

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

        btnEstablecerDepartamentos.setText("Establecer Departamentos a la empresa");
        btnEstablecerDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstablecerDepartamentosActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlHorasMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlHorasMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlBaseParaTasaDepartamental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(btnAgregarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(btnEstablecerDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlHorasMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlHorasMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlBaseParaTasaDepartamental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnAgregarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnEstablecerDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jtppGeneralidadDepartamento.addTab("Generalidad Departamento", jPanel2);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Generales de la Orden"));

        txtUnidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Unidades"));

        txtImporteMaterialDirecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Material Directo"));

        txtNumeroOrden.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nro"));

        btnCrearOrden.setText("Crear Orden");
        btnCrearOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtNumeroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtImporteMaterialDirecto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(btnCrearOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImporteMaterialDirecto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnCrearOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

        btnLlenarBasesDepartamentos.setText("Llenar Bases del Departamento ");
        btnLlenarBasesDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarBasesDepartamentosActionPerformed(evt);
            }
        });

        btnGenerarOrden.setText("Generar Orden");
        btnGenerarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlOrdenMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlOrdenMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(btnLlenarBasesDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnGenerarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlOrdenMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlOrdenMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLlenarBasesDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnGenerarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jtppGeneralidadDepartamento.addTab("Orden", jPanel7);

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

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlHojaCostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlHojaCostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jtppGeneralidadDepartamento.addTab("Hoja de Costos", jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtppGeneralidadDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtppGeneralidadDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

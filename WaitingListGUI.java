import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;


public class WaitingListGUI extends JFrame 
{
	String unitType;
	int appId;
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	private ArrayList<Unit> unitList = new ArrayList<Unit>();
	private JLabel optionLabel;
	private JLabel customerIdLabel;
	private JLabel applicationIdLabel;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel telephoneLabel;
	private JLabel emailAddressLabel;
	private JLabel unitTypeLabel;
	private JLabel customerLabel;
	
	private JCheckBox customerCheckBox;
	private JCheckBox addunitCheckBox;
	//private JCheckBox twobedroomCheckBox;
	private ButtonGroup checkBoxGroup;
	
	private JTextField customerIdField;
	private JTextField applicationIdField;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField telephoneField;
	private JTextField emailAddressField;
	private JButton submitButton;
	private JButton finishButton;
	private JPanel optionPanel;
	
	private Scanner input;
	/*
	private ArrayList<Owner> ownersList = new ArrayList<Owner>();
        private ArrayList<Property> propertiesList = new ArrayList<Property>();
	private String[] subdivisionList =  {"NONE","KINGLY_ESTATES","STATELY_ESTATES","KING_MANOR","GREEN_GABLES"}; */
	private JComboBox<String> customerComboBox = new JComboBox<String>();
	/*private JComboBox<String> subdivisionComboBox; */
	
	private String[] unitTypeList={"Plese Select Unit Type","One Bedroom", "Two Bedrooms","Three Bedrooms"};
	private JComboBox<String> unitTypeComboBox= new JComboBox<String>(unitTypeList);

	public WaitingListGUI()
	{
		super("Waiting List Editor");
		setLayout(new GridLayout(10,2));

		customerComboBox.addItem("Plese Select A Customer");
		

		/*readOwners();
		readProperties();*/
		
		optionLabel = new JLabel("Select Option");
		customerIdLabel = new JLabel("Customer ID");
		applicationIdLabel= new JLabel("Application ID");
		firstNameLabel = new JLabel("First Name");
		lastNameLabel = new JLabel("Last Name");
		telephoneLabel = new JLabel("Telephone");
		emailAddressLabel = new JLabel("Email Address");
		unitTypeLabel= new JLabel("Unit Type");
		customerLabel = new JLabel("Select a Customer");
		
			
		customerIdField = new JTextField(15);
		applicationIdField= new JTextField(15);
		firstNameField = new JTextField(15);
		lastNameField = new JTextField(15);
		telephoneField = new JTextField(10);
		emailAddressField = new JTextField(15);	
							
		customerCheckBox = new JCheckBox("Add Customer");
		addunitCheckBox = new JCheckBox("Add a Unit");
		//twobedroomCheckBox = new JCheckBox("Add 2 Bedrooms");
		checkBoxGroup = new ButtonGroup();
		checkBoxGroup.add(customerCheckBox);
		checkBoxGroup.add(addunitCheckBox);
		//checkBoxGroup.add(twobedroomCheckBox);
		optionPanel = new JPanel();
		optionPanel.setLayout(new GridLayout(1,2));
		optionPanel.add(customerCheckBox);
		optionPanel.add(addunitCheckBox);
		//optionPanel.add(twobedroomCheckBox);
		
		customerCheckBox.addItemListener(new ItemListener()
		{	
			public void itemStateChanged(ItemEvent ie) 
			{
				customerIdField.setEnabled(true);
				customerIdLabel.setEnabled(true);
				applicationIdField.setEnabled(true);
				applicationIdLabel.setEnabled(true);
				firstNameField.setEnabled(true);
				firstNameLabel.setEnabled(true);
				lastNameField.setEnabled(true);
				lastNameLabel.setEnabled(true);
				telephoneField.setEnabled(true);
				telephoneLabel.setEnabled(true);
				emailAddressField.setEnabled(true);
				emailAddressLabel.setEnabled(true);
			 	customerComboBox.setEnabled(false); 
			 	customerLabel.setEnabled(false);
			 	unitTypeLabel.setEnabled(false);
			 	unitTypeComboBox.setEnabled(false);
				}
		});
		addunitCheckBox.addItemListener(new ItemListener()
		{	
			public void itemStateChanged(ItemEvent ie) 
			{
				customerIdField.setEnabled(false);
				customerIdLabel.setEnabled(false);
				applicationIdField.setEnabled(false);
				applicationIdLabel.setEnabled(false);
				firstNameField.setEnabled(false);
				firstNameLabel.setEnabled(false);
				lastNameField.setEnabled(false);
				lastNameLabel.setEnabled(false);
				telephoneField.setEnabled(false);
				telephoneLabel.setEnabled(false);
				emailAddressField.setEnabled(false);
				emailAddressLabel.setEnabled(false);
			 	customerComboBox.setEnabled(true); 
			 	customerLabel.setEnabled(true);
			 	unitTypeLabel.setEnabled(true);
			 	unitTypeComboBox.setEnabled(true);
				}
		});
		/*
		twobedroomCheckBox.addItemListener(new ItemListener()
		{	
			public void itemStateChanged(ItemEvent ie) 
			{
				customerIdField.setEnabled(false);
				customerIdLabel.setEnabled(false);
				applicationIdField.setEnabled(false);
				applicationIdLabel.setEnabled(false);
				firstNameField.setEnabled(false);
				firstNameLabel.setEnabled(false);
				lastNameField.setEnabled(false);
				lastNameLabel.setEnabled(false);
				telephoneField.setEnabled(false);
				telephoneLabel.setEnabled(false);
				emailAddressField.setEnabled(false);
				emailAddressLabel.setEnabled(false);
			 	customerComboBox.setEnabled(true);
			 	customerLabel.setEnabled(true);
				}
		});
		*/

		submitButton = new JButton("SUBMIT");
		finishButton = new JButton("FINISH");

                
        	ButtonHandler handler = new ButtonHandler();
        	submitButton.addActionListener(handler);
        	finishButton.addActionListener(handler);

		add(optionLabel);
		add(optionPanel);
		add(customerIdLabel);
		add(customerIdField);
		
		add(applicationIdLabel);
		add(applicationIdField);
		
		add(firstNameLabel);
		add(firstNameField);
		
		add(lastNameLabel);
		add(lastNameField);
		
		add(telephoneLabel);
		add(telephoneField);
		
		add(emailAddressLabel);
		add(emailAddressField);
		
		add(customerLabel);
		add(customerComboBox);
		
		add(unitTypeLabel);
		add(unitTypeComboBox);
		
		add(submitButton);
		add(finishButton);
		
		
	}
	
	class ButtonHandler implements ActionListener
	{
		int custId;
		//int appId;
                String fname;
                String lname;
                int tel;
                String email;
                String street;
                String city;
                String state;
                int zip;
                String customerName;
                String Date; 
                int propertyId;
                String propertyName;
                int region;
               // String unitType;
                int unitNumber;
                
             
           
               
                
                               
		public void actionPerformed(ActionEvent ae)
		{
			if((!customerCheckBox.isSelected()) && (!addunitCheckBox.isSelected()) )
                        {
                           // JOptionPane.showMessageDialog(null,"Select Add Customer or  Add Unit");
                        }
                        else 
                        {
                            if(ae.getSource() == submitButton)
                            {
                                if(customerCheckBox.isSelected())
                                {
                                    if(checkCustomerInput())
                                    {
                                        custId = Integer.parseInt(customerIdField.getText());
                                        appId= Integer.parseInt(applicationIdField.getText());
                                        fname = firstNameField.getText();
                                        lname = lastNameField.getText();
                                        tel = Integer.parseInt(telephoneField.getText());
                                        email = emailAddressField.getText();
                                        customerList.add(new Customer(custId,fname,lname,tel,email));
                                        customerComboBox.addItem(fname+" " +lname);                                         
                                       clearCustomer();
                                    }
                                }
                                else if (addunitCheckBox.isSelected())
                                {
                                	if(checkoneBedroomInput())
                                	{
                                		customerName=customerComboBox.getSelectedItem().toString();
                                		unitType=unitTypeComboBox.getSelectedItem().toString();
                                		unitList.add(new Unit(propertyId, propertyName,region,street,city,state,zip,unitType,unitNumber));
                                		
                                		
                                		for(Customer c: customerList)
                                		{
                                			if(customerName.equals(c.getCustomerFName()))
                                			{
                                				c.addUnit(new Unit(propertyId, propertyName,region,street,city,state,zip,unitType,unitNumber));
                                			}
                                		}
                                	}
                                	clearoneBedroom();
                                	writeCustomerList();
                                }
               
                            }
                            
                            /*
                            else 
                            {
                            	if(checktwoBedroomInput())
                            	{
                            		customerName=customerComboBox.getSelectedItem().toString();
                            		unitList.add(new Unit(propertyId, propertyName,region,street,city,state,zip,unitType,unitNumber));
                       
                            		for(Customer c: customerList)
                            		{
                            			if(customerName.equals(c.getCustomerFName()))
                            			{
                            				c.addUnit(new Unit(propertyId, propertyName,region,street,city,state,zip,unitType,unitNumber));
                            			}
                            		}
                            			
                            	}
                            	//cleartwoBedroom();
                            }*/
                            
                            
                            	writeCustomerList();
                            	//clearCustomer();
                            	clearoneBedroom();
                            	//cleartwoBedroom();
                           
                           
                         }
			
						if (ae.getSource()==finishButton)
						{
							writeCustomerList();
							System.exit(0);
						}
		}
                
                public boolean checkCustomerInput()
                {
                    boolean input = true;
                    
                    if(customerIdField.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"Please enter customer ID");
                        customerIdField.requestFocus();
                        input = false;
                    }
          
                    else if(applicationIdField.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"Please enter application ID");
                        applicationIdField.requestFocus();
                        input = false;
                    }
                    else if(firstNameField.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"Please enter first name");
                        firstNameField.requestFocus();
                        input = false;
                    }
                    else if(lastNameField.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"Please enter last name");
                        lastNameField.requestFocus();
                        input = false;
                    }
                    else if(telephoneField.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"Please enter telephone number");
                        telephoneField.requestFocus();
                        input = false;
                    }
                    else if(emailAddressField.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"Please enter email address");
                        emailAddressField.requestFocus();
                        input = false;                            
                    }
                    else if(!telephoneField.getText().isEmpty())
                    {
                        try
                        {
                            Integer.parseInt(telephoneField.getText());
                        }
                        catch(NumberFormatException nfe)
                        {
                            JOptionPane.showMessageDialog(null,"Please enter an integer in the correct format for telephone number");
                            telephoneField.setText("");
                            telephoneField.requestFocus();
                            input = false;
                        }
                    }
                          
                    return input;
                }
                public boolean checkoneBedroomInput()
                {
                    boolean input = true;
                    
                    if(customerComboBox.getSelectedItem().equals(""))
                    {
                        JOptionPane.showMessageDialog(null,"Please select a customer");
                        input = false;
                    }
                    return input;
                }
                public boolean checktwoBedroomInput()
                {
                    boolean input = true;
                    
                    if(customerComboBox.getSelectedItem().equals(""))
                    {
                        JOptionPane.showMessageDialog(null,"Please select a customer");
                        input = false;
                    }
                    return input;
                }
	}
        
        
        
        public void clearCustomer()
        {
            customerIdField.setText("");
            applicationIdField.setText("");
            firstNameField.setText("");
            lastNameField.setText("");
            telephoneField.setText("");
            emailAddressField.setText("");
            customerIdField.requestFocus();
        }
        public void clearoneBedroom()
        {   
            customerComboBox.setSelectedIndex(0);
            unitTypeComboBox.setSelectedIndex(0);
            applicationIdField.setText("");
            customerIdField.setText("");
        }
        
        /*
        public void cleartwoBedroom()
        {
        	//customerComboBox.setSelectedIndex(0);
            applicationIdField.setText("");
            customerIdField.setText("");           
        }
	*/
        public void writeCustomerList()
        {
        	Formatter output;
        	int custId;
        	String fname;
        	String lname;
        	int telephone;
        	String email;
        	//String unit;
        	
        	try
        	{
        		output= new Formatter("customerslist.txt");
        		for(Customer c: customerList)
        		{
        			custId= c.getCustomerId();
        			fname=c.getCustomerFName();
        			lname=c.getCustomerLName();
        			telephone=c.getCustomerTelephone();
        			email=c.getCustomerEmail();
        			//unit=(String) unitTypeComboBox.getSelectedItem(); 
        			
        			//output.format("%d,%s,%s,%d,%s",custId,fname,lname,telephone,email);

        			/*
        			output.format("%s","Customer ID   ");
        			
        			output.format("%s","Customer First Name   ");
        			
        			output.format("%s","Customer Last Name   ");
        			
        			output.format("%s","Customer Telephone   ");
        			
        			output.format("%s","Customer Email \n");  */
        
        			
        			output.format("%d",custId);
        			output.format("%s","\n, ");
        			output.format("%d",appId);
        			output.format("%s","\n, ");
        			output.format("%s",fname);
        			output.format("%s","\n ");
        			output.format("%s",lname);
        			output.format("%s","\n, ");
        			output.format("%s",unitType);
        			output.format("%s","\n, ");
        			output.format("%d",telephone);
        			output.format("%s","\n, ");
        			output.format("%s",email);
        			output.format("%s","\n");
        		
        			
        		}
        		output.close();
        	}
        	catch(IOException ioe)
        	{
        		ioe.printStackTrace();
        	}
        		
        }
        /*
        public void writeUnitList()
        {
        	Formatter output;
        	ArrayList<Unit>uList= new ArrayList<Unit>();
        	
        	try
        	{
        		output= new Formatter("unitList.txt");
        		
        		for(Customer c:customerList)
        		{
        			uList=c.getUnitList();
        			for(Unit u:uList)
        			{
        				if(u.getClass().getName().equals("Unit"))
        				{
        					output.format(" ");
        					
        				}
        			}
        		}
        	}
        	catch(IOException ioe)
        	{
        		ioe.printStackTrace();
        	}
        }*/
	                                     
}